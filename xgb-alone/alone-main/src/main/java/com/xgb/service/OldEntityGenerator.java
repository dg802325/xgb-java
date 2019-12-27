package com.xgb.service;

import com.xgb.entity.JDBCGenerator;
import com.xgb.entity.TableColumnInfo;
import com.xgb.utils.DataUtils;
import com.xgb.util.StringUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

/**
 * Model层 代码生成器 Created by xgb on 2019/07/26.
 */
public class OldEntityGenerator extends GeneratorConfig{

    public static Boolean genGeratorCode(String path,String tableName,List<TableColumnInfo> tableColumnInfos) {
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableColumnInfos);
        data.put("modelName",StringUtils.tableNameConvertUpperCamel(tableName));
        data.put("codeEntity3",codeEntity3(tableColumnInfos));
        data.put("codeEntity2",codeEntity2(tableColumnInfos));
        try {
            File controllerFile = new File(path  +SLASH+ "Read"+StringUtils.tableNameConvertUpperCamel(tableName)+"Service.java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("readOracleTxt.ftl").process(data, new FileWriter(controllerFile));
        } catch (Exception e) {
            throw new RuntimeException("About 生成失败!", e);
        }
        return true;
    }

    private static String codeEntity3(List<TableColumnInfo> tableColumnInfos) {
        StringBuilder stringBuilder = new StringBuilder();
        for(TableColumnInfo ti : tableColumnInfos){
            stringBuilder.append(space8);
            stringBuilder.append("//"+ti.getRemarks()).append("\n");
            stringBuilder.append(space8);
            stringBuilder.append("if(MyTools.isNotEmpty(stNjReport3.get").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("())){").append("\n");
            stringBuilder.append(space12);
            stringBuilder.append("JcContentAttr1 jc = new JcContentAttr1();");
            stringBuilder.append("jc.setContentId(contentId);").append("\n");
            stringBuilder.append(space12);
            stringBuilder.append("jc.setAttrName(\"\");").append("\n");
            stringBuilder.append(space12);
            stringBuilder.append("jc.setAttrValue(stNjReport3.get").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("());").append("lists.add(jc);jc=null;}").append("\n");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


//    public static String codeEntity(List<TableColumnInfo> tableColumnInfos){
//        StringBuilder stringBuilder = new StringBuilder();
//        //生成基础
//        for(TableColumnInfo ti : tableColumnInfos){
//            stringBuilder.append(space8);
//            stringBuilder.append(StringUtils.builderString(ti)).append(space1).append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName()));
//            stringBuilder.append(" = ").append("content.get").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(" ();");
//            stringBuilder.append("//"+ti.getRemarks());
//            stringBuilder.append("\n");
//        }
//        return stringBuilder.toString();
//    }
//
//    public static String codeEntity1(List<TableColumnInfo> tableColumnInfos){
//        StringBuilder stringBuilder = new StringBuilder();
//        //生成基础
//        for(TableColumnInfo ti : tableColumnInfos){
//            stringBuilder.append(space8);
//            stringBuilder.append("buffer.append(").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("+\"|\");");
//            stringBuilder.append("\n");
//        }
//        return stringBuilder.toString();
//    }


    public static String codeEntity2(List<TableColumnInfo> tableColumnInfos){
        StringBuilder stringBuilder = new StringBuilder();
        //生成基础
        int len = tableColumnInfos.size();
        for (int i=0;i<len;i++){
            stringBuilder.append(space8);
            stringBuilder.append("if(MyTools.isNotEmpty(split[").append(i).append("])){").append("\n");
            stringBuilder.append(space12);
            stringBuilder.append("fcc.set").append(StringUtils.tableNameConvertUpperCamel(tableColumnInfos.get(i).getColumnName()));
            if("String".equals(StringUtils.builderString(tableColumnInfos.get(i)))){
                stringBuilder.append("(split[").append(i).append("]);").append("\n");
            }else if("Integer".equals(StringUtils.builderString(tableColumnInfos.get(i)))){
                stringBuilder.append("(Integer.parseInt(split[").append(i).append("]));").append("\n");
            }else if("BigDecimal".equals(StringUtils.builderString(tableColumnInfos.get(i)))){
                stringBuilder.append("(new BigDecimal(split[").append(i).append("]));").append("\n");
            }else if("Date".equals(StringUtils.builderString(tableColumnInfos.get(i)))){
                stringBuilder.append("(DateUtils.strToDateLong(split[").append(i).append("]));").append("\n");
            }else {
                stringBuilder.append("(split[").append(i).append("]);").append("\n");
            }
            stringBuilder.append(space8).append("}").append("\n");
        }
        return stringBuilder.toString();
    }

}
