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
 * SqlMapper层 代码生成器 Created by xgb on 2019/07/26.
 */
public class SqlMapperXmlGenerator extends CodeGeneratorManager implements CodeGenerator {

    @Override
    public void genGeratorCode(List<TableInformation> tableInformation, Generator generator, SysDatabases sysDatabases,String path) {
        String tableName = generator.getTableName();
        String tn = StringUtils.tableNameTotn(tableName);
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        String customMapping = "/";
        Map<String, Object> data = DataUtil.getDataMapInit(tableName, modelName,tableInformation);
        data.put("sqlMapperHeader",sqlMapperHeader());
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("tn",tn);
        data.put("codeSqlMapperModel",codeSqlMapperModel(tableInformation,tn));
        data.put("codeSqlIsModelNull",codeSqlIsModelNull(tableInformation,tn));
        data.put("limit","limit #{begin}, #{end}");
        try {
            File controllerFile = new File(path +customMapping+sysDatabases.getDirectoryPrefix()+customMapping+"dao"+customMapping+ modelName + "SqlMapper.xml");
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

    public String codeSqlMapperModel(List<TableInformation> tableInformation,String tn){
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
        int size = tableInformation.size();
        int i = 0;
        //生成基础
        for(TableInformation ti : tableInformation){
            i++;
            if(i==size){
                stringBuilder.append(space2).append(tn).append(".").append(ti.getColumnName()).append(" AS ").append(StringUtils.lineToHump(ti.getColumnName()));
            }else {
                stringBuilder.append(space2).append(tn).append(".").append(ti.getColumnName()).append(" AS ").append(StringUtils.lineToHump(ti.getColumnName())).append(",\n");
            }
        }
        return stringBuilder.toString();
    }

    public String codeSqlIsModelNull(List<TableInformation> tableInformation,String tn){
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
        String space3 = "            ";
        //生成基础
        int size = tableInformation.size();
        int i = 0;
        for(TableInformation ti : tableInformation){
            i++;
            if(i==size){
                stringBuilder.append(space2).append("<if ").append("test=\"").append(StringUtils.lineToHump(ti.getColumnName())).append(" != null and ").append(StringUtils.lineToHump(ti.getColumnName())).append(" !=''\">").append("\n");
                stringBuilder.append(space3).append("AND ").append(tn).append(".").append(ti.getColumnName()).append(" = #{").append(StringUtils.lineToHump(ti.getColumnName())).append("}\n");
                stringBuilder.append(space2).append("</if>");
            }else {
                stringBuilder.append(space2).append("<if ").append("test=\"").append(StringUtils.lineToHump(ti.getColumnName())).append(" != null and ").append(StringUtils.lineToHump(ti.getColumnName())).append(" !=''\">").append("\n");
                stringBuilder.append(space3).append("AND ").append(tn).append(".").append(ti.getColumnName()).append(" = #{").append(StringUtils.lineToHump(ti.getColumnName())).append("}\n");
                stringBuilder.append(space2).append("</if>").append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
