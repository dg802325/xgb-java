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
 * Mapper层 代码生成器 Created by xgb on 2019/07/26.
 */
public class MapperGenerator extends GeneratorConfig{

    public Boolean genGeratorCode(List<TableColumnInfo> tableColumnInfos, JDBCGenerator jdbcGenerator, SysDatabases sysDatabases, String path) {
        String tableName = jdbcGenerator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableColumnInfos, sysDatabases);
        data.put("mapperPackage",sysDatabases.getDirectoryPrefix()+".dao");
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        try {
            File controllerFile = new File(path +SLASH+sysDatabases.getDirectoryPrefix()+SLASH+"dao"+SLASH+ modelName + "Mapper.java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("mapper.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "Mapper.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("Mapper 生成失败!", e);
        }
        return true;
    }
}
