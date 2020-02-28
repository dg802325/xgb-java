package com.xgb.service;

import com.xgb.entity.TableColumnInfo;
import com.xgb.util.StringUtils;
import com.xgb.utils.DataUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class NewEntityGenerator extends GeneratorConfig {

    public static Boolean genGeratorCode(String path,String tableName,List<TableColumnInfo> tableColumnInfos) {
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableColumnInfos);
        data.put("codeEntity",codeEntity(tableColumnInfos));
        data.put("insert",codeEntity1(tableColumnInfos,tableName));
        data.put("modelName",StringUtils.tableNameConvertUpperCamel(tableName));
        data.put("test",test(tableColumnInfos));
        try {
            File controllerFile = new File(path  +SLASH+ StringUtils.tableNameConvertUpperCamel(tableName)+".java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("newEntity.ftl").process(data, new FileWriter(controllerFile));
        } catch (Exception e) {
            throw new RuntimeException("Model 生成失败!", e);
        }
        return true;
    }

    public static String codeEntity(List<TableColumnInfo> tableColumnInfos){
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


    public static String codeEntity1(List<TableColumnInfo> tcf,String tableName){
        StringBuilder stringBuilder = new StringBuilder();
        //生成基础
        stringBuilder.append("insert into ").append(tableName).append("(");
        for (int i = 0,len=tcf.size(); i < len; i++) {
            if(i==0){

            }else if(i==len){
                stringBuilder.append(tcf.get(i).getColumnName());
            }else {
                stringBuilder.append(tcf.get(i).getColumnName().toLowerCase()).append(",");
            }
        }
        stringBuilder.append(") value(");
        for (int i = 0,len=tcf.size(); i < len; i++) {
            if(i==0){

            }else if(i==len){
                stringBuilder.append("?");
            }else {
                stringBuilder.append("?,");
            }
        }
        stringBuilder.append(");");
        return stringBuilder.toString();
    }


    public static String test(List<TableColumnInfo> tableColumnInfos){
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
          stringBuilder.append(ti.getColumnName()).append(" as ").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",").append("\n");
        }
        return stringBuilder.toString();
    }

}
