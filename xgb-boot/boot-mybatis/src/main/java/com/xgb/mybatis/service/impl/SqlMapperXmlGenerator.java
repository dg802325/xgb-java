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
    public void genCode(List<TableInformation> tableInformation, Generator generator, SysDatabases sysDatabases) {
        String tableName = generator.getTableName();
        String tn = StringUtils.tableNameTotn(tableName);
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        String customMapping = "/";
        Map<String, Object> data = DataUtil.getDataMapInit(tableName, modelName,tableInformation);
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("tn",tn);
        data.put("codeSqlMapperModel",codeSqlMapperModel(tableInformation,tn));
        data.put("codeSqlIsModelNull",codeSqlIsModelNull(tableInformation,tn));
        data.put("limit","limit #{begin}, #{end}");
        try {
            System.out.println(PROJECT_PATH + customMapping + "boot-model" + customMapping + sysDatabases.getDirectoryPrefix()
                    + customMapping + "model" + customMapping + modelName + ".java");
            File controllerFile = new File(PROJECT_PATH +customMapping+"page"+customMapping+ modelName + "SqlMapper.xml");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("sqlMapperXml.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "sqlMapperXml.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("sqlMapperXml 生成失败!", e);
        }
    }

    public String codeSqlMapperModel(List<TableInformation> tableInformation,String tn){
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
        int i = 0;
        //生成基础
        for(TableInformation ti : tableInformation){
            if(i==0){
                stringBuilder.append(space2).append(tn).append(".").append(ti.getColumnName()).append(" AS ").append(StringUtils.builderString(ti));
            }else {
                stringBuilder.append(space2).append(tn).append(".").append(ti.getColumnName()).append(" AS ").append(StringUtils.builderString(ti)).append(",\n");
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public String codeSqlIsModelNull(List<TableInformation> tableInformation,String tn){
        StringBuilder stringBuilder = new StringBuilder();
        String space2 = "        ";
//        <if test="acctId!= null and acctId!=''">
//                AND ab.ACCT_ID LIKE '%${acctId}%'
//        </if>
        //生成基础
        for(TableInformation ti : tableInformation){
            stringBuilder.append(space2).append("<if ").append("test")
        }
        return stringBuilder.toString();
    }

}
