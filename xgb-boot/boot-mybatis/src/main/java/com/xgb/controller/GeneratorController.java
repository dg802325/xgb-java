package com.xgb.controller;

import com.alibaba.fastjson.JSONArray;
import com.xgb.entity.JDBCGenerator;
import com.xgb.entity.R;
import com.xgb.model.SysDatabases;
import com.xgb.service.GeneratorService;
import com.xgb.service.SysDatabasesService;
import com.xgb.util.FileUtils;
import com.xgb.util.JDBCUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.util.List;

@RestController
public class GeneratorController {

    @Value("${mybatis.generator.path}")
    private String mybatisPath;
    @Autowired
    private SysDatabasesService sysDatabasesService;

    @PostMapping("/generate/startGenerator")
    public R startGenerator(JDBCGenerator jdbcGenerator){
        //生成代码逻辑
        //获取JDBC连接数据库
        String dataId = jdbcGenerator.getDataId();
        SysDatabases sysDatabases = sysDatabasesService.selectByPrimaryKey(dataId);
        //删除就目录下的文件，防止生成出来重复的东西
        FileUtils.deleteDirectory(mybatisPath+"/"+dataId);
        //生成新的目录下文件
        FileUtils.CreatFileDir(mybatisPath+"/"+dataId);
        //获得生成目录
        String path = mybatisPath+"/"+dataId;
        String dbUrl = JDBCUtils.getSqlType(sysDatabases.getDatabaseType(), sysDatabases.getDatabaseUrl(), sysDatabases.getDatabasePortNumber(),sysDatabases.getDatabaseName());
        String driver = JDBCUtils.getDriver(sysDatabases.getDatabaseType());
        //连接数据库
        Connection connection = JDBCUtils.getConnection(driver, dbUrl, sysDatabases.getDatabaseLoginName(), sysDatabases.getDatabaseLoginPassword());
        //获得要生成的全部表名
        List<String> strings = JSONArray.parseArray(jdbcGenerator.getTableName(), String.class);
        Boolean generator = new GeneratorService().generator(connection, strings, jdbcGenerator, sysDatabases, path);

        return null;
    }
}
