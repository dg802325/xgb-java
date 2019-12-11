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

public class ModelGenerator extends GeneratorConfig {

    public Boolean genGeratorCode(List<TableColumnInfo> tableColumnInfos, JDBCGenerator jdbcGenerator, SysDatabases sysDatabases, String path) {
        String tableName = jdbcGenerator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableColumnInfos, sysDatabases);
        //包路径
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        //生成model 和 get set方法
        data.put("codeEntity",codeEntity(tableColumnInfos));
        try {
            File controllerFile = new File(path +SLASH+sysDatabases.getDirectoryPrefix()+SLASH+"model"+SLASH+ modelName + ".java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("model.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "Model.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("Model 生成失败!", e);
        }
        return true;
    }

    public String codeEntity(List<TableColumnInfo> tableColumnInfos){
        StringBuilder stringBuilder = new StringBuilder();
        String space = "    ";
        int i = 0;
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            if(i==0){
                stringBuilder.append("private ");
                stringBuilder.append(StringUtils.builderString(ti)).append(" ").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(";\n");
            }else {
                stringBuilder.append(space).append("private ");
                stringBuilder.append(StringUtils.builderString(ti)).append(" ").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(";\n");
            }
            i++;
        }
        stringBuilder.append("\n");
        stringBuilder.append("\n");
        //生成getset方法
        for(TableColumnInfo ti : tableColumnInfos){
            //生成get
            stringBuilder.append(space).append("public ");
            stringBuilder.append(StringUtils.builderString(ti)).append(" ").append("get").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(" (){").append("\n");
            stringBuilder.append(space).append(space);
            stringBuilder.append("return "+StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(";").append("\n");
            stringBuilder.append(space).append("}").append("\n");
            //生成set
            stringBuilder.append(space).append("public ");
            stringBuilder.append(StringUtils.builderString(ti)).append(" ").append("set").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(" (").append(StringUtils.builderString(ti)).append(" ").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("){").append("\n");
            stringBuilder.append(space).append(space);
            stringBuilder.append("return this."+StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" = ").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(";").append("\n");
            stringBuilder.append(space).append("}").append("\n");
        }
        return stringBuilder.toString();
    }
}
