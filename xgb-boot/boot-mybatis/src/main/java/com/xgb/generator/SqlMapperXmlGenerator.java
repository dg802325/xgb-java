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
 * SqlMapper层 代码生成器 Created by xgb on 2019/07/26.
 */
public class SqlMapperXmlGenerator extends GeneratorConfig{

    public void genGeratorCode(List<TableColumnInfo> tableColumnInfos, JDBCGenerator jdbcGenerator, SysDatabases sysDatabases, String path) {
        String tableName = jdbcGenerator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        String tn = StringUtils.tableNameTotn(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableColumnInfos, sysDatabases);
        data.put("sqlMapperHeader",sqlMapperHeader());
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("tn",tn);
        data.put("codeSqlMapperModel",codeSqlMapperModel(tableColumnInfos,tn));
        data.put("codeSqlIsModelNull",codeSqlIsModelNull(tableColumnInfos,tn));
        data.put("limit","limit #{begin}, #{end}");
        try {
            File controllerFile = new File(path +SLASH+sysDatabases.getDirectoryPrefix()+SLASH+"dao"+SLASH+ modelName + "SqlMapper.xml");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("sqlMapperXml.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "sqlMapperXml.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("sqlMapperXml 生成失败!", e);
        }
    }
    public String sqlMapperHeader(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>").append("\n");
        stringBuilder.append("<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\" >");
        return stringBuilder.toString();
    }

    public String codeSqlMapperModel(List<TableColumnInfo> tableColumnInfos,String tn){
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
        int size = tableColumnInfos.size();
        int i = 0;
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(i==size){
                stringBuilder.append(space2).append(tn).append(".").append(ti.getColumnName()).append(" AS ").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName()));
            }else {
                stringBuilder.append(space2).append(tn).append(".").append(ti.getColumnName()).append(" AS ").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",\n");
            }
        }
        return stringBuilder.toString();
    }

    public String codeSqlIsModelNull(List<TableColumnInfo> tableColumnInfos,String tn){
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
        String space3 = "            ";
        //生成基础
        int size = tableColumnInfos.size();
        int i = 0;
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(i==size){
                stringBuilder.append(space2).append("<if ").append("test=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" != null and ").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" !=''\">").append("\n");
                stringBuilder.append(space3).append("AND ").append(tn).append(".").append(ti.getColumnName()).append(" = #{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("}\n");
                stringBuilder.append(space2).append("</if>");
            }else {
                stringBuilder.append(space2).append("<if ").append("test=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" != null and ").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" !=''\">").append("\n");
                stringBuilder.append(space3).append("AND ").append(tn).append(".").append(ti.getColumnName()).append(" = #{").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("}\n");
                stringBuilder.append(space2).append("</if>").append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
