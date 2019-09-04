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
 * Model层 代码生成器 Created by xgb on 2019/07/26.
 */
public class ModelGenerator extends CodeGeneratorManager implements CodeGenerator {

    @Override
    public void genGeratorCode(List<TableInformation> tableInformation, Generator generator, SysDatabases sysDatabases,String path) {
        String tableName = generator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        String customMapping = "/";
        Map<String, Object> data = DataUtil.getDataMapInit(tableName, modelName,tableInformation);
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("codeEntity",codeEntity(tableInformation));
        try {
            File controllerFile = new File(path +customMapping+sysDatabases.getDirectoryPrefix()+customMapping+"model"+customMapping+ modelName + ".java");
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
        //生成基础
        for(TableInformation ti : tableInformation){
            if(i==0){
                stringBuilder.append("private ");
                stringBuilder.append(StringUtils.builderString(ti)).append(StringUtils.lineToHump(ti.getColumnName())).append(";\n");
            }else {
                stringBuilder.append(space).append("private ");
                stringBuilder.append(StringUtils.builderString(ti)).append(StringUtils.lineToHump(ti.getColumnName())).append(";\n");
            }
            i++;
        }
        stringBuilder.append("\n");
        stringBuilder.append("\n");
        //生成getset方法
        for(TableInformation ti : tableInformation){
            //生成get
            stringBuilder.append(space).append("public ");
            stringBuilder.append(StringUtils.builderString(ti)).append("get").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(" (){").append("\n");
            stringBuilder.append(space).append(space);
            stringBuilder.append("return "+StringUtils.lineToHump(ti.getColumnName())).append(";").append("\n");
            stringBuilder.append(space).append("}").append("\n");
            //生成set
            stringBuilder.append(space).append("public ");
            stringBuilder.append(StringUtils.builderString(ti)).append("set").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(" (").append(StringUtils.builderString(ti)).append(" ").append(StringUtils.lineToHump(ti.getColumnName())).append("){").append("\n");
            stringBuilder.append(space).append(space);
            stringBuilder.append("return this."+StringUtils.lineToHump(ti.getColumnName())).append(" = ").append(StringUtils.lineToHump(ti.getColumnName())).append(";").append("\n");
            stringBuilder.append(space).append("}").append("\n");
        }
        return stringBuilder.toString();
    }


}
