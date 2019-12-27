package com.xgb.service;

import com.xgb.entity.TableColumnInfo;
import com.xgb.model.JcModelItem;
import com.xgb.util.DateUtils;
import com.xgb.util.StringUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewModelItemGenerator extends GeneratorConfig {

    public static Boolean genGeratorCode(String path, String tableName, List<JcModelItem> tableColumnInfos) {
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = getDataMapInit(tableName, tableColumnInfos);
        data.put("modelName", StringUtils.tableNameConvertUpperCamel(tableName));
        data.put("getEntity1",getEntity1(tableColumnInfos));
        try {
            File controllerFile = new File(path  +SLASH+ StringUtils.tableNameConvertUpperCamel(tableName)+".java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("newModelItem.ftl").process(data, new FileWriter(controllerFile));
        } catch (Exception e) {
            throw new RuntimeException("Model 生成失败!", e);
        }
        return true;
    }

    public static String getEntity1(List<JcModelItem> tableColumnInfos){
        StringBuilder stringBuilder = new StringBuilder();
        String space = "    ";
        int i = 0;
        //生成基础
        for(JcModelItem ti : tableColumnInfos){
            if(i==0){
                stringBuilder.append("private ");
                stringBuilder.append(getType(ti)).append(" ").append(StringUtils.tableNameConvertLowerCamel(ti.getField())).append(";\n");
            }else {
                stringBuilder.append(space).append("private ");
                stringBuilder.append(getType(ti)).append(" ").append(StringUtils.tableNameConvertLowerCamel(ti.getField())).append(";\n");
            }
            i++;
        }
        stringBuilder.append("\n");
        stringBuilder.append("\n");
        //生成getset方法
        for(JcModelItem ti : tableColumnInfos){
            //生成get
            stringBuilder.append(space).append("public ");
            stringBuilder.append(getType(ti)).append(" ").append("get").append(StringUtils.tableNameConvertUpperCamel(ti.getField())).append(" (){").append("\n");
            stringBuilder.append(space).append(space);
            stringBuilder.append("return "+StringUtils.tableNameConvertLowerCamel(ti.getField())).append(";").append("\n");
            stringBuilder.append(space).append("}").append("\n");
            //生成set
            stringBuilder.append(space).append("public ");
            stringBuilder.append(getType(ti)).append(" ").append("set").append(StringUtils.tableNameConvertUpperCamel(ti.getField())).append(" (").append(getType(ti)).append(" ").append(StringUtils.tableNameConvertLowerCamel(ti.getField())).append("){").append("\n");
            stringBuilder.append(space).append(space);
            stringBuilder.append("return this."+StringUtils.tableNameConvertLowerCamel(ti.getField())).append(" = ").append(StringUtils.tableNameConvertLowerCamel(ti.getField())).append(";").append("\n");
            stringBuilder.append(space).append("}").append("\n");
        }
        return stringBuilder.toString();
    }


    public static String getType(JcModelItem ti){
        if(1==ti.getDataType()){
            return "String";
        }else if(2==ti.getDataType()){
            return "Integer";
        }else if(3==ti.getDataType()){
            return "Integer";
        }else if(4==ti.getDataType()){
            return "String";
        }else if(5==ti.getDataType()){
            return "Date";
        }else if(6==ti.getDataType()){
            return "String";
        }else if(7==ti.getDataType()){
            return "String";
        }else if(8==ti.getDataType()){
            return "String";
        }else if(9==ti.getDataType()){
            return "String";
        }else if(10==ti.getDataType()){
            return "String";
        }else if(11==ti.getDataType()){
            return "Integer";
        }else{
            return null;
        }
    }











    /**
     * 预置页面所需数据
     *
     * @param tableName 表名
     * @return
     */
    public static Map<String, Object> getDataMapInit(String tableName, List<JcModelItem> tableColumnInfos) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("date", DateUtils.getNowDateToString());
        return data;
    }



}
