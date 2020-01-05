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

/**
 * MapperXml层 代码生成器 Created by xgb on 2019/07/26.
 */
public class MapperXmlGenerator extends GeneratorConfig{

    public Boolean genGeratorCode(List<TableColumnInfo> tableColumnInfos, JDBCGenerator jdbcGenerator, SysDatabases sysDatabases, String path) {
        String tableName = jdbcGenerator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableColumnInfos, sysDatabases);
        data.put("mapperPackage",sysDatabases.getDirectoryPrefix()+".dao");
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("codeXmlMapper",codeXmlMapper(tableColumnInfos));
        data.put("getTableColumnName",getTableColumnName(tableColumnInfos));
        data.put("inset",codeInsert(tableColumnInfos,tableName));
        data.put("codeInsertSelective1",codeInsertSelective1(tableColumnInfos));
        data.put("codeInsertSelective2",codeInsertSelective2(tableColumnInfos));
        data.put("codeUpdateExampleSelective1",codeUpdateExampleSelective1(tableColumnInfos));
        data.put("update",codeUpdate(tableColumnInfos,tableName));
        data.put("codeUpdateByKey",codeUpdateByKey(tableColumnInfos));
        data.put("codeUpdateByKeySelective",codeUpdateByKeySelective(tableColumnInfos));
        data.put("whereId"," ID = #{id,jdbcType=VARCHAR}");
        data.put("orderByClause","${orderByClause}");
        data.put("listItem","#{listItem}");
        data.put("condition0","and ${criterion.condition}");
        data.put("condition1","and ${criterion.condition}");
        data.put("condition2","and ${criterion.condition} #{criterion.value}");
        data.put("condition3","and ${criterion.condition} #{criterion.value} and #{criterion.secondValue}");

        try {
            File controllerFile = new File(path +SLASH+sysDatabases.getDirectoryPrefix()+SLASH+"dao"+SLASH+ modelName + "Mapper.xml");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("mapperXml.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "MapperXml.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("MapperXml 生成失败!", e);
        }
        return true;
    }

    public String codeUpdateByKey(List<TableColumnInfo> tableColumnInfos){
        tableColumnInfos = DataUtils.xmlDataFormat(tableColumnInfos);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        int size = tableColumnInfos.size();
        int i = 0;
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(i==size){
                stringBuilder.append(space3).append(ti.getColumnName()).append(" = #{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("}");
            }else {
                stringBuilder.append(space3).append(ti.getColumnName()).append(" = #{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("},\n");
            }
    }
        return stringBuilder.toString();
    }

    public String codeUpdateByKeySelective(List<TableColumnInfo> tableColumnInfos){
        tableColumnInfos = DataUtils.xmlDataFormat(tableColumnInfos);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        String space4 = "                ";
        int size = tableColumnInfos.size();
        int i = 0;
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if("ID".equals(ti.getColumnName())){
                continue;
            }
            if(i==size){
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append(" = #{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("}").append("\n");
                stringBuilder.append(space3).append("</if>");
            }else {
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append(" = #{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("},").append("\n");
                stringBuilder.append(space3).append("</if>").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String codeUpdate(List<TableColumnInfo> tableColumnInfos,String tableName){
        tableColumnInfos = DataUtils.xmlDataFormat(tableColumnInfos);
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
        String space3 = "            ";
        stringBuilder.append(space2).append("update ").append(tableName).append(" set ").append("\n").append(space3);
        int size = tableColumnInfos.size();
        int y = 0;
        for(TableColumnInfo ti : tableColumnInfos){
            y++;
            if(y==size){
                stringBuilder.append(ti.getColumnName()).append(" = #{record.").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",").append("jdbcType=").append(ti.getTypeName()).append("} ");
            }else {
                stringBuilder.append(ti.getColumnName()).append(" = #{record.").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",").append("jdbcType=").append(ti.getTypeName()).append("}, ");
            }
        }
        return stringBuilder.toString();
    }



    public String codeUpdateExampleSelective1(List<TableColumnInfo> tableColumnInfos){
        tableColumnInfos = DataUtils.xmlDataFormat(tableColumnInfos);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        String space4 = "                ";
        int size = tableColumnInfos.size();
        int i = 0;
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(i==size){
                stringBuilder.append(space3).append("<if test=\"record.").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append(" = #{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("}").append("\n");
                stringBuilder.append(space3).append("</if>");
            }else {
                stringBuilder.append(space3).append("<if test=\"record.").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append(" = #{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("},").append("\n");
                stringBuilder.append(space3).append("</if>").append("\n");
            }
        }
        return stringBuilder.toString();
    }


    public String codeInsertSelective1(List<TableColumnInfo> tableColumnInfos){
        tableColumnInfos = DataUtils.xmlDataFormat(tableColumnInfos);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        String space4 = "                ";
        int size = tableColumnInfos.size();
        int i = 0;
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(i==size){
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append("\n");
                stringBuilder.append(space3).append("</if>");
            }else {
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append(",").append("\n");
                stringBuilder.append(space3).append("</if>").append("\n");
            }
        }
        return stringBuilder.toString();
    }
    public String codeInsertSelective2(List<TableColumnInfo> tableColumnInfos){
        tableColumnInfos = DataUtils.xmlDataFormat(tableColumnInfos);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        String space4 = "                ";
        int size = tableColumnInfos.size();
        int i = 0;
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(i==size){
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append("#{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("}").append("\n");
                stringBuilder.append(space3).append("</if>");
            }else {
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append("#{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("},").append("\n");
                stringBuilder.append(space3).append("</if>").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String codeInsert(List<TableColumnInfo> tableColumnInfos,String tableName){
        tableColumnInfos = DataUtils.xmlDataFormat(tableColumnInfos);
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
        String space3 = "            ";
        stringBuilder.append(space2).append("insert into ").append(tableName).append(" (");
        int size = tableColumnInfos.size();
        int i = 0;
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(i==size){
                stringBuilder.append(ti.getColumnName()).append(")");
            }else {
                stringBuilder.append(ti.getColumnName()).append(", ");
            }
        }
        int y = 0;
        stringBuilder.append("\n").append(space2).append("values (");
        for(TableColumnInfo ti : tableColumnInfos){
            y++;
            if(y==size){
                stringBuilder.append("#{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",").append("jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("} ").append(")");
            }else {
                stringBuilder.append("#{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",").append("jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("}, ");
            }
        }
        return stringBuilder.toString();
    }

    public String getTableColumnName(List<TableColumnInfo> tableColumnInfos){
        tableColumnInfos = DataUtils.xmlDataFormat(tableColumnInfos);
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
        stringBuilder.append(space2);
        int i = 0;
        int size = tableColumnInfos.size();
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if (i==size){
                stringBuilder.append(ti.getColumnName());
            }else {
                stringBuilder.append(ti.getColumnName()).append(",");
            }
        }
        return stringBuilder.toString();
    }

    public String codeXmlMapper(List<TableColumnInfo> tableColumnInfos){
        tableColumnInfos = DataUtils.xmlDataFormat(tableColumnInfos);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            if("ID".equals(ti.getColumnName())){
                stringBuilder.append(space3).append("<idArg column=").append("\"ID\" ").append("jdbcType=").append("\"").append(StringUtils.mysqlToMysql(ti)).append("\" javaType=\"").append(StringUtils.builderToPathString(ti)).append("\" />").append("\n");
            }else {
                stringBuilder.append(space3).append("<arg column=").append("\"").append(ti.getColumnName()).append("\" jdbcType=").append("\"").append(StringUtils.mysqlToMysql(ti)).append("\" javaType=\"").append(StringUtils.builderToPathString(ti)).append("\" />").append("\n");
            }
        }
        return stringBuilder.toString();
    }


}
