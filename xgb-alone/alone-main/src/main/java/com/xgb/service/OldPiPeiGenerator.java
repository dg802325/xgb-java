package com.xgb.service;

import com.xgb.entity.TableColumnInfo;
import com.xgb.util.StringUtils;
import com.xgb.utils.DataUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

/**
 * Model层 代码生成器 Created by xgb on 2019/07/26.
 */
public class OldPiPeiGenerator extends GeneratorConfig{

    public static Boolean genGeratorCode(String path,String tableName,List<TableColumnInfo> tableColumnInfos) {
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableColumnInfos);
        data.put("modelName",StringUtils.tableNameConvertUpperCamel(tableName));
        data.put("codeEntity3",codeEntity3(StringUtils.tableNameConvertLowerCamel(tableName),tableColumnInfos));
        try {
            File controllerFile = new File(path  +SLASH+ "pipei"+StringUtils.tableNameConvertUpperCamel(tableName)+".txt");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("oldPiPei.ftl").process(data, new FileWriter(controllerFile));
        } catch (Exception e) {
            throw new RuntimeException("About 生成失败!", e);
        }
        return true;
    }

    private static String codeEntity3(String tableName,List<TableColumnInfo> tableColumnInfos) {
        StringBuilder stringBuilder = new StringBuilder();
        for(TableColumnInfo ti : tableColumnInfos){
            stringBuilder.append(space8);
            stringBuilder.append("//"+ti.getRemarks()).append("\n");
            stringBuilder.append(space8);
            stringBuilder.append("if(MyTools.isNotEmpty(").append(tableName).append(".get").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("())){").append("\n");
            stringBuilder.append(space12);
            stringBuilder.append("JcContentAttr1 jc = new JcContentAttr1();");
            stringBuilder.append("jc.setContentId(contentId);").append("\n");
            stringBuilder.append(space12);
            stringBuilder.append("jc.setAttrName(\"\");").append("\n");
            stringBuilder.append(space12);
            stringBuilder.append("jc.setAttrValue(").append(tableName).append(".get").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("());").append("lists.add(jc);jc=null;}").append("\n");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
