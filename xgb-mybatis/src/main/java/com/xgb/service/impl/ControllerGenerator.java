package com.xgb.service.impl;

import com.xgb.service.CodeGenerator;
import com.xgb.service.CodeGeneratorManager;
import com.xgb.util.DataUtil;
import com.xgb.util.StringUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;

/**
 * Controller层 代码生成器 Created by xgb on 2019/07/26.
 */
public class ControllerGenerator extends CodeGeneratorManager implements CodeGenerator {

    @Override
    public void genCode(String tableName) {
//        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
//        Configuration cfg = getFreemarkerConfiguration();
//        String customMapping = "/";
//        String modelNameUpperCamel = modelName;
//
//        Map<String, Object> data = DataUtil.getDataMapInit(tableName, modelName, modelNameUpperCamel);
//        try {
//            String permissions = StringUtils.createPermissions(tableName);
//            data.put("permissions",permissions);
//            data.put("modelName",StringUtils.tableNameConvertLowerCamel(tableName));
//            data.put("lowerCaseTableName",tableName.toLowerCase());
//            data.put("myCommonPath",MY_COMMON_PATH);
//            File controllerFile = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_CONTROLLER + customMapping
//                                           + modelNameUpperCamel + "Controller.java");
//            if (!controllerFile.getParentFile().exists()) {
//                controllerFile.getParentFile().mkdirs();
//            }
//            cfg.getTemplate("main.ftl").process(data, new FileWriter(controllerFile));
//            logger.info(modelNameUpperCamel + "Controller.java 生成成功!");
//        } catch (Exception e) {
//            throw new RuntimeException("Controller 生成失败!", e);
//        }
    }


}
