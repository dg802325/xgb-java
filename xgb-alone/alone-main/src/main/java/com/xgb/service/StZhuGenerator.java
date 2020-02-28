package com.xgb.service;

import com.xgb.entity.TableColumnInfo;
import com.xgb.util.StringUtils;
import com.xgb.utils.DataUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class StZhuGenerator extends GeneratorConfig{

    public static Boolean genGeratorCode(String path, String tableName, List<TableColumnInfo> tableColumnInfos) {
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableColumnInfos);
        data.put("modelName", StringUtils.tableNameConvertUpperCamel(tableName));
        data.put("codeEntity",codeEntity(tableColumnInfos));
        try {
            File controllerFile = new File(path  +SLASH+ StringUtils.tableNameConvertUpperCamel(tableName)+".java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("stZhu.ftl").process(data, new FileWriter(controllerFile));
        } catch (Exception e) {
            throw new RuntimeException("Model 生成失败!", e);
        }
        return true;
    }

    private static String codeEntity(List<TableColumnInfo> tableColumnInfos) {
        StringBuilder stringBuilder = new StringBuilder();
        for(TableColumnInfo ti : tableColumnInfos){
            stringBuilder.append(ti.getRemarks()).append(space1);
            stringBuilder.append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(space1);
            stringBuilder.append("${formConsultationCase.").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("!}");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
