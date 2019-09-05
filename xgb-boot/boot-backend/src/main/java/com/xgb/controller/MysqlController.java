package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.lang.R;
import com.xgb.model.Generator;
import com.xgb.model.SysDatabases;
import com.xgb.model.SysMabtaisPlus;
import com.xgb.mybatis.main.MybatisUtils;
import com.xgb.mybatis.util.FileUtil;
import com.xgb.service.SysDatabasesService;
import com.xgb.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/admin/")
@RestController
public class MysqlController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MybatisUtils mybatisUtils;
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysDatabasesService sysDatabasesService;
    @Value("${mybatis.generator.path}")
    private String mybatisPath;
//
    /**
     * 查询数据库列表
     * @return
     */
    @GetMapping("getDatabaseList")
    public R getDatabaseList(){
        logger.info("------request-address----------------：/admin/getDatabaseList");
        String sysUserId = SessionUtil.getSysUserId();
        List<SysDatabases> sysDatabasesByCreateId = sysDatabasesService.getSysDatabasesByCreateId(sysUserId);
        Map<String,Object> map = new HashMap<>();
        map.put("databases",sysDatabasesByCreateId);
        return R.ok(map,"查询成功");
    }


    /**
     * 查询表列表
     * @param dataId
     * @return
     * @throws SQLException
     */
    @GetMapping("getTableList")
    public R getTableList(String dataId) throws SQLException {
        logger.info("------request-address----------------：/admin/getTableList");
        Map<String,Object> parentMap = new HashMap<String,Object>();
        SysDatabases sysDatabases = sysDatabasesService.selectByPrimaryKey(dataId);
        String dbUrl = mybatisUtils.getSqlType(sysDatabases.getDatabaseType(), sysDatabases.getDatabaseUrl(), sysDatabases.getDatabasePortNumber(),sysDatabases.getDatabaseName());
        String driver = mybatisUtils.getDriver(sysDatabases.getDatabaseType());
        Connection connection = mybatisUtils.getConnection(driver, dbUrl, sysDatabases.getDatabaseLoginName(), sysDatabases.getDatabaseLoginPassword());
        List<SysMabtaisPlus> tables = mybatisUtils.getTables(connection);
        if(tables.size()>0){
            parentMap.put("tables",tables);
            return R.ok(parentMap,"查询成功");
        }
        return R.error(999,"查询失败");
    }

    @PostMapping("runGenerator")
    public R runGenerator(Generator generator) throws SQLException {
        logger.info("------request-address----------------：/admin/runGenerator");
        FileUtil.deleteDirectory(mybatisPath+"/"+generator.getDataId());
        //生成
        FileUtil.CreatFileDir(mybatisPath+"/"+generator.getDataId());
        String s = mybatisUtils.generatorCode(generator,mybatisPath+"/"+generator.getDataId());
        if("success".equals(s)){
            return R.ok("生成成功");
        }
        return R.error(999,"生成失败");
    }

    /**
     * 下载生成的文件
     */
    @ResponseBody
    @RequestMapping(value = "codeGeneratorDownload",method = RequestMethod.GET)
    public void download(String dataId, HttpServletResponse response) throws IOException {
        SysDatabases sysDatabases = sysDatabasesService.selectByPrimaryKey(dataId);
        //1.获取要下载的文件的绝对路径
        String realPath = mybatisPath+"/"+sysDatabases.getId()+"/"+sysDatabases.getId()+"/"+sysDatabases.getDatabaseName()+".zip";
        //2.获取要下载的文件名
        String fileName = sysDatabases.getDatabaseName()+".zip";
        response.reset();
        response.setContentType("application/octet-stream");
        //3.设置content-disposition响应头控制浏览器以下载的形式打开文件
        response.setHeader("content-disposition", "attachment;filename="+ URLEncoder.encode(fileName, "UTF-8"));
        InputStream in = new FileInputStream(realPath);//获取文件输入流
        int len = 0;
        byte[] buffer = new byte[1024];
        OutputStream out = response.getOutputStream();
        while ((len = in.read(buffer)) > 0) {
            out.write(buffer,0,len);//将缓冲区的数据输出到客户端浏览器
        }
        in.close();
    }

    /**
     * 下载文件后删除数据
     */
    @ResponseBody
    @RequestMapping(value = "deleteFile",method = RequestMethod.GET)
    public void deleteFile(String dataId){
        SysDatabases sysDatabases = sysDatabasesService.selectByPrimaryKey(dataId);
        //1.获取要下载的文件的绝对路径

        logger.info("删除模板文件");
    }

}