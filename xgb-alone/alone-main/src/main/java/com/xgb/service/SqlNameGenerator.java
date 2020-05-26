package com.xgb.service;

import com.xgb.entity.TableColumnInfo;
import com.xgb.model.jojc;
import com.xgb.util.StringUtils;
import com.xgb.utils.DataUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlNameGenerator extends GeneratorConfig {

    public static Boolean genGeratorCode(String path,String tableName,List<jojc> tableColumnInfos) {
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = new HashMap<>();
        data.put("jj",codeEntity(tableColumnInfos));
        try {
            File controllerFile = new File(path  +SLASH+ StringUtils.tableNameConvertUpperCamel(tableName)+".java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("jojc.ftl").process(data, new FileWriter(controllerFile));
        } catch (Exception e) {
            throw new RuntimeException("Model 生成失败!", e);
        }
        return true;
    }

    public static String codeEntity(List<jojc> jj){
        StringBuilder stringBuilder = new StringBuilder();
        String space = "    ";
        int i = 0;
        //生成基础
        for(jojc ti : jj){
            stringBuilder.append("update jo_user set username = '").append(ti.getOldName().replaceAll("\\u00A0","")).append("' where user_id = ").append(ti.getSqlId()).append(";\n");
            stringBuilder.append("update jc_user set username = '").append(ti.getOldName().replaceAll("\\u00A0","")).append("' where user_id = ").append(ti.getSqlId()).append(";\n");
        }
        return stringBuilder.toString();
    }



}
