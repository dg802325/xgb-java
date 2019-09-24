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
 * ModelExample层 代码生成器 Created by xgb on 2019/07/26.
 */
public class ModelExampleGenerator extends CodeGeneratorManager implements CodeGenerator {

    @Override
    public void genGeratorCode(List<TableInformation> tableInformation, Generator generator, SysDatabases sysDatabases,String path) {
        String tableName = generator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        String customMapping = "/";
        Map<String, Object> data = DataUtil.getDataMapInit(tableName, modelName,tableInformation,sysDatabases);
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("isList",true);
        data.put("codeEntityExample",codeEntityExample(tableInformation));
        try {
            File controllerFile = new File(path +customMapping+sysDatabases.getDirectoryPrefix()+customMapping+"model"+customMapping+ modelName + "Example.java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("modelExample.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "ModelExample.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("ModelExample 生成失败!", e);
        }
    }

    public String codeEntityExample(List<TableInformation> tableInformation){
        StringBuilder stringBuilder = new StringBuilder();
        String space = "    ";

        for (TableInformation ti :tableInformation){
            //is null
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("IsNull(){").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" is null\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //is notnull
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("IsNotNull(){").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" is not null\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //EqualTo
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("EqualTo(").append(StringUtils.builderString(ti)).append(" value").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" =\", value, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //EqualNotTo
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("NotEqualTo(").append(StringUtils.builderString(ti)).append(" value").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" <>\", value, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //GreaterThan
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("GreaterThan(").append(StringUtils.builderString(ti)).append(" value").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" >\", value, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //GreaterThanOrEqualTo
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("GreaterThanOrEqualTo(").append(StringUtils.builderString(ti)).append(" value").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" >=\", value, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //LessThan
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("LessThan(").append(StringUtils.builderString(ti)).append(" value").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" <\", value, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //LessThanOrEqualTo
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("LessThanOrEqualTo(").append(StringUtils.builderString(ti)).append(" value").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" <=\", value, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //Like
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("Like(").append(StringUtils.builderString(ti)).append(" value").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" like\", value, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //NotLike
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("NotLike(").append(StringUtils.builderString(ti)).append(" value").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" not like\", value, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //In
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("In(").append("List<").append(StringUtils.builderString(ti)).append(">").append(" values").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" in\", values, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //NotIn
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("NotIn(").append("List<").append(StringUtils.builderString(ti)).append(">").append(" values").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" not in\", values, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //Between
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("Between(").append(StringUtils.builderString(ti)).append(" value1, ").append(StringUtils.builderString(ti)).append(" value2").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" between\", value1, value2, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");
            //NotBetween
            stringBuilder.append(space).append(space).append("public Criteria and").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("NotBetween(").append(StringUtils.builderString(ti)).append(" value1, ").append(StringUtils.builderString(ti)).append(" value2").append(") {").append("\n");
            stringBuilder.append(space).append(space).append(space).append("addCriterion(\"").append(ti.getColumnName()).append(" not between\", value1, value2, \"id\");").append("\n");
            stringBuilder.append(space).append(space).append(space).append("return (Criteria)this;").append("\n");
            stringBuilder.append(space).append(space).append("}").append("\n");
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }


}
