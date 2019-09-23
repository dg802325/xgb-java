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
 * MapperXml层 代码生成器 Created by xgb on 2019/07/26.
 */
public class MapperXmlGenerator extends CodeGeneratorManager implements CodeGenerator {

    @Override
    public void genGeratorCode(List<TableInformation> tableInformation, Generator generator, SysDatabases sysDatabases,String path) {
        String tableName = generator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        String customMapping = "/";
        Map<String, Object> data = DataUtil.getDataMapInit(tableName, modelName,tableInformation);
        data.put("mapperPackage",sysDatabases.getDirectoryPrefix()+".dao");
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("codeXmlMapper",codeXmlMapper(tableInformation));
        data.put("getTableColumnName",getTableColumnName(tableInformation));
        data.put("inset",codeInsert(tableInformation,tableName));
        data.put("codeInsertSelective1",codeInsertSelective1(tableInformation));
        data.put("codeInsertSelective2",codeInsertSelective2(tableInformation));
        data.put("codeUpdateExampleSelective1",codeUpdateExampleSelective1(tableInformation));
        data.put("update",codeUpdate(tableInformation,tableName));
        data.put("codeUpdateByKey",codeUpdateByKey(tableInformation));
        data.put("codeUpdateByKeySelective",codeUpdateByKeySelective(tableInformation));
        data.put("whereId"," ID = #{id,jdbcType=VARCHAR}");
        data.put("orderByClause","${orderByClause}");
        data.put("listItem","#{listItem}");
        data.put("condition0","and ${criterion.condition}");
        data.put("condition1","and ${criterion.condition}");
        data.put("condition2","and ${criterion.condition} #{criterion.value}");
        data.put("condition3","and ${criterion.condition} #{criterion.value} and #{criterion.secondValue}");

        try {
            File controllerFile = new File(path +customMapping+sysDatabases.getDirectoryPrefix()+customMapping+"dao"+customMapping+ modelName + "Mapper.xml");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("mapperXml.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "MapperXml.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("MapperXml 生成失败!", e);
        }
    }

    public String codeUpdateByKey(List<TableInformation> tableInformation){
        tableInformation = DataUtil.xmlDataFormat(tableInformation);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        int size = tableInformation.size();
        int i = 0;
        for(TableInformation ti : tableInformation){
            i++;
            if(i==size){
                stringBuilder.append(space3).append(ti.getColumnName()).append(" = #{").append(StringUtils.lineToHump(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("}");
            }else {
                stringBuilder.append(space3).append(ti.getColumnName()).append(" = #{").append(StringUtils.lineToHump(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("},\n");
            }
    }
        return stringBuilder.toString();
    }

    public String codeUpdateByKeySelective(List<TableInformation> tableInformation){
        tableInformation = DataUtil.xmlDataFormat(tableInformation);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        String space4 = "                ";
        int size = tableInformation.size();
        int i = 0;
        for(TableInformation ti : tableInformation){
            i++;
            if("ID".equals(ti.getColumnName())){
                continue;
            }
            if(i==size){
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.lineToHump(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append(" = #{").append(StringUtils.lineToHump(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("}").append("\n");
                stringBuilder.append(space3).append("</if>");
            }else {
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.lineToHump(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append(" = #{").append(StringUtils.lineToHump(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("},").append("\n");
                stringBuilder.append(space3).append("</if>").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String codeUpdate(List<TableInformation> tableInformation,String tableName){
        tableInformation = DataUtil.xmlDataFormat(tableInformation);
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
        String space3 = "            ";
        stringBuilder.append(space2).append("update ").append(tableName).append(" set ").append("\n").append(space3);
        int size = tableInformation.size();
        int y = 0;
        for(TableInformation ti : tableInformation){
            y++;
            if(y==size){
                stringBuilder.append(ti.getColumnName()).append(" = #{record.").append(StringUtils.lineToHump(ti.getColumnName())).append(",").append("jdbcType=").append(ti.getTypeName()).append("} ");
            }else {
                stringBuilder.append(ti.getColumnName()).append(" = #{record.").append(StringUtils.lineToHump(ti.getColumnName())).append(",").append("jdbcType=").append(ti.getTypeName()).append("}, ");
            }
        }
        return stringBuilder.toString();
    }



    public String codeUpdateExampleSelective1(List<TableInformation> tableInformation){
        tableInformation = DataUtil.xmlDataFormat(tableInformation);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        String space4 = "                ";
        int size = tableInformation.size();
        int i = 0;
        for(TableInformation ti : tableInformation){
            i++;
            if(i==size){
                stringBuilder.append(space3).append("<if test=\"record.").append(StringUtils.lineToHump(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append(" = #{").append(StringUtils.lineToHump(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("}").append("\n");
                stringBuilder.append(space3).append("</if>");
            }else {
                stringBuilder.append(space3).append("<if test=\"record.").append(StringUtils.lineToHump(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append(" = #{").append(StringUtils.lineToHump(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("},").append("\n");
                stringBuilder.append(space3).append("</if>").append("\n");
            }
        }
        return stringBuilder.toString();
    }


    public String codeInsertSelective1(List<TableInformation> tableInformation){
        tableInformation = DataUtil.xmlDataFormat(tableInformation);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        String space4 = "                ";
        int size = tableInformation.size();
        int i = 0;
        for(TableInformation ti : tableInformation){
            i++;
            if(i==size){
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.lineToHump(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append("\n");
                stringBuilder.append(space3).append("</if>");
            }else {
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.lineToHump(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append(ti.getColumnName()).append(",").append("\n");
                stringBuilder.append(space3).append("</if>").append("\n");
            }
        }
        return stringBuilder.toString();
    }
    public String codeInsertSelective2(List<TableInformation> tableInformation){
        tableInformation = DataUtil.xmlDataFormat(tableInformation);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        String space4 = "                ";
        int size = tableInformation.size();
        int i = 0;
        for(TableInformation ti : tableInformation){
            i++;
            if(i==size){
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.lineToHump(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append("#{").append(StringUtils.lineToHump(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("}").append("\n");
                stringBuilder.append(space3).append("</if>");
            }else {
                stringBuilder.append(space3).append("<if test=\"").append(StringUtils.lineToHump(ti.getColumnName())).append(" != null\" >").append("\n");
                stringBuilder.append(space4).append("#{").append(StringUtils.lineToHump(ti.getColumnName())).append(",jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("},").append("\n");
                stringBuilder.append(space3).append("</if>").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String codeInsert(List<TableInformation> tableInformation,String tableName){
        tableInformation = DataUtil.xmlDataFormat(tableInformation);
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
        String space3 = "            ";
        stringBuilder.append(space2).append("insert into ").append(tableName).append(" (");
        int size = tableInformation.size();
        int i = 0;
        for(TableInformation ti : tableInformation){
            i++;
            if(i==size){
                stringBuilder.append(ti.getColumnName()).append(")");
            }else {
                stringBuilder.append(ti.getColumnName()).append(", ");
            }
        }
        int y = 0;
        stringBuilder.append("\n").append(space2).append("values (");
        for(TableInformation ti : tableInformation){
            y++;
            if(y==size){
                stringBuilder.append("#{").append(StringUtils.lineToHump(ti.getColumnName())).append(",").append("jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("} ").append(")");
            }else {
                stringBuilder.append("#{").append(StringUtils.lineToHump(ti.getColumnName())).append(",").append("jdbcType=").append(StringUtils.mysqlToMysql(ti)).append("}, ");
            }
        }
        return stringBuilder.toString();
    }

    public String getTableColumnName(List<TableInformation> tableInformation){
        tableInformation = DataUtil.xmlDataFormat(tableInformation);
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
        stringBuilder.append(space2);
        int i = 0;
        int size = tableInformation.size();
        for(TableInformation ti : tableInformation){
            i++;
            if (i==size){
                stringBuilder.append(ti.getColumnName());
            }else {
                stringBuilder.append(ti.getColumnName()).append(",");
            }
        }
        return stringBuilder.toString();
    }

    public String codeXmlMapper(List<TableInformation> tableInformation){
        tableInformation = DataUtil.xmlDataFormat(tableInformation);
        StringBuilder stringBuilder = new StringBuilder();
        String space3 = "            ";
        //生成基础
        for(TableInformation ti : tableInformation){
            if("ID".equals(ti.getColumnName())){
                stringBuilder.append(space3).append("<idArg column=").append("\"ID\" ").append("jdbcType=").append("\"").append(StringUtils.mysqlToMysql(ti)).append("\" javaType=\"").append(StringUtils.builderToPathString(ti)).append("\" />").append("\n");
            }else {
                stringBuilder.append(space3).append("<arg column=").append("\"").append(ti.getColumnName()).append("\" jdbcType=").append("\"").append(StringUtils.mysqlToMysql(ti)).append("\" javaType=\"").append(StringUtils.builderToPathString(ti)).append("\" />").append("\n");
            }
        }
        return stringBuilder.toString();
    }


}
