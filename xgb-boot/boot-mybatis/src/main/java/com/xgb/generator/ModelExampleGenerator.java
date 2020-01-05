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
 * ModelExample层 代码生成器 Created by xgb on 2019/07/26.
 */
public class ModelExampleGenerator extends GeneratorConfig {

    public Boolean genGeratorCode(List<TableColumnInfo> tableInformation, JDBCGenerator jdbcGenerator, SysDatabases sysDatabases, String path) {
        String tableName = jdbcGenerator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableInformation, sysDatabases);
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("isList",true);
        data.put("codeEntityExample",codeEntityExample(tableInformation));
        try {
            File controllerFile = new File(path +SLASH+sysDatabases.getDirectoryPrefix()+SLASH+"model"+SLASH+ modelName + "Example.java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("modelExample.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "ModelExample.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("ModelExample 生成失败!", e);
        }
        return true;
    }

    public String codeEntityExample(List<TableColumnInfo> tableColumnInfos){
        StringBuilder stringBuilder = new StringBuilder();
        String space = "    ";
        for (TableColumnInfo ti :tableColumnInfos){
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
