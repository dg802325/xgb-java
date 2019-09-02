package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.lang.R;
import com.xgb.model.Generator;
import com.xgb.model.SysDatabases;
import com.xgb.model.SysMabtaisPlus;
import com.xgb.mybatisplus.main.MybatisUtils;
import com.xgb.service.SysDatabasesService;
import com.xgb.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        System.out.println(generator);
        //生成
            String s = mybatisUtils.generatorCode(generator);
        return null;
    }


}