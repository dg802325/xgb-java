package com.xgb.mybatisplus.service.impl;

import com.xgb.model.Generator;
import com.xgb.model.SysDatabases;
import com.xgb.model.TableInformation;
import com.xgb.mybatisplus.service.CodeGenerator;
import com.xgb.mybatisplus.service.CodeGeneratorManager;
import com.xgb.mybatisplus.util.DataUtil;
import com.xgb.mybatisplus.util.StringUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Controller层 代码生成器 Created by xgb on 2019/07/26.
 */
public class ModelGenerator extends CodeGeneratorManager implements CodeGenerator {

    @Override
    public void genCode(List<TableInformation> tableInformation, Generator generator, SysDatabases sysDatabases) {
        String tableName = generator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        String customMapping = "/";
        Map<String, Object> data = DataUtil.getDataMapInit(tableName, modelName,tableInformation);
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("codeEntity",codeEntity(tableInformation));
        try {
            System.out.println(PROJECT_PATH + customMapping + "boot-model" + customMapping + sysDatabases.getDirectoryPrefix()
                    + customMapping + "model" + customMapping + modelName + ".java");
            File controllerFile = new File(PROJECT_PATH +customMapping+"page"+customMapping+ modelName + ".java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("model.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "Model.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("Model 生成失败!", e);
        }
    }

    public String codeEntity(List<TableInformation> tableInformation){
        StringBuilder stringBuilder = new StringBuilder();
        String space = "    ";
        int i = 0;
        for(TableInformation ti : tableInformation){
            if(i==0){
                stringBuilder.append("private ");
                if("VARCHAR".equals(ti.getTypeName())){
                    stringBuilder.append("String ").append(StringUtils.lineToHump(ti.getColumnName())).append(";\n");
                }else if("DATETIME".equals(ti.getTypeName())||"DATE".equals(ti.getTypeName())){
                    stringBuilder.append("Date ").append(StringUtils.lineToHump(ti.getColumnName())).append(";\n");
                }else if("DECIMAL".equals(ti.getTypeName())){
                    stringBuilder.append("BigDecimal ").append(StringUtils.lineToHump(ti.getColumnName())).append(";\n");
                }else if("INT".equals(ti.getTypeName())){
                    stringBuilder.append("int ").append(StringUtils.lineToHump(ti.getColumnName())).append(";\n");
                }
            }
        }
        return stringBuilder.toString();
    }


}
