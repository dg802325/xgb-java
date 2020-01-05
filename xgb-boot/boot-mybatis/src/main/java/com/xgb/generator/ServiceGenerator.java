package com.xgb.generator;

import com.xgb.entity.JDBCGenerator;
import com.xgb.entity.TableColumnInfo;
import com.xgb.model.SysDatabases;
import com.xgb.util.DataUtils;
import com.xgb.util.StringUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

/**
 * Service层 代码生成器 Created by xgb on 2019/07/26.
 */
public class ServiceGenerator extends GeneratorConfig{

    public void genGeratorCode(List<TableColumnInfo> tableColumnInfos, JDBCGenerator jdbcGenerator, SysDatabases sysDatabases, String path) {
        String tableName = jdbcGenerator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableColumnInfos, sysDatabases);
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("mapperPackage",sysDatabases.getDirectoryPrefix()+".dao");
        data.put("servicePackage",sysDatabases.getDirectoryPrefix()+".com.xgb.service");
        try {
            File controllerFile = new File(path +SLASH+sysDatabases.getDirectoryPrefix()+SLASH+"com.xgb.service"+SLASH+ modelName + "Service.java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("com.xgb.service.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "com.xgb.service.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("com.xgb.service 生成失败!", e);
        }
    }

}
