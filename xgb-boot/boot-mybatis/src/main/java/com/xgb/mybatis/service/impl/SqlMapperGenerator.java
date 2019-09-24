package com.xgb.mybatis.service.impl;

import com.xgb.model.Generator;
import com.xgb.model.SysDatabases;
import com.xgb.model.TableInformation;
import com.xgb.mybatis.service.CodeGenerator;
import com.xgb.mybatis.service.CodeGeneratorManager;
import com.xgb.mybatis.util.DataUtil;
import com.xgb.mybatis.util.StringUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

/**
 * SqlMapper层 代码生成器 Created by xgb on 2019/07/26.
 */
public class SqlMapperGenerator extends CodeGeneratorManager implements CodeGenerator {

    @Override
    public void genGeratorCode(List<TableInformation> tableInformation, Generator generator, SysDatabases sysDatabases, String path) {
        String tableName = generator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        String customMapping = "/";
        Map<String, Object> data = DataUtil.getDataMapInit(tableName, modelName,tableInformation,sysDatabases);
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("mapperPackage",sysDatabases.getDirectoryPrefix()+".dao");
        try {
            File controllerFile = new File(path +customMapping+sysDatabases.getDirectoryPrefix()+customMapping+"dao"+customMapping+ modelName + "SqlMapper.java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("sqlMapper.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "sqlMapper.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("sqlMapper 生成失败!", e);
        }
    }

}
