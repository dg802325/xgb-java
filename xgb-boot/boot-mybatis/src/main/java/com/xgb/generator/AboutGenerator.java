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
 * Model层 代码生成器 Created by xgb on 2019/07/26.
 */
public class AboutGenerator extends GeneratorConfig{

    public Boolean genGeratorCode(List<TableColumnInfo> tableColumnInfos, JDBCGenerator jdbcGenerator, SysDatabases sysDatabases, String path) {
        String tableName = jdbcGenerator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableColumnInfos, sysDatabases);
        data.put("permissions",StringUtils.createPermissions(tableName));
        data.put("codeEntity",codeEntity(tableColumnInfos));
        data.put("toController",jdbcGenerator.getIsController());
        data.put("toVueList",jdbcGenerator.getIsVueList());
        try {
            File controllerFile = new File(path +SLASH+sysDatabases.getDirectoryPrefix()+SLASH + modelName + ".txt");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("about.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "About.txt 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("About 生成失败!", e);
        }
        return true;
    }

    public String codeEntity(List<TableColumnInfo> tableColumnInfos){
        StringBuilder stringBuilder = new StringBuilder();
        String space = "    ";
        int i = 0;
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            if(i==0){
                stringBuilder.append("private ");
                stringBuilder.append(StringUtils.builderString(ti)).append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(";\n");
            }else {
                stringBuilder.append(space).append("private ");
                stringBuilder.append(StringUtils.builderString(ti)).append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(";\n");
            }
            i++;
        }
        stringBuilder.append("\n");
        stringBuilder.append("\n");
        //生成getset方法
        for(TableColumnInfo ti : tableColumnInfos){
            //生成get
            stringBuilder.append(space).append("public ");
            stringBuilder.append(StringUtils.builderString(ti)).append("get").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(" (){").append("\n");
            stringBuilder.append(space).append(space);
            stringBuilder.append("return "+StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(";").append("\n");
            stringBuilder.append(space).append("}").append("\n");
            //生成set
            stringBuilder.append(space).append("public ");
            stringBuilder.append(StringUtils.builderString(ti)).append("set").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(" (").append(StringUtils.builderString(ti)).append(" ").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("){").append("\n");
            stringBuilder.append(space).append(space);
            stringBuilder.append("return this."+StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" = ").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(";").append("\n");
            stringBuilder.append(space).append("}").append("\n");
        }
        return stringBuilder.toString();
    }


}
