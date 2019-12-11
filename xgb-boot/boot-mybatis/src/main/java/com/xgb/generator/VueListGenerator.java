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
 * VueList层 代码生成器 Created by xgb on 2019/07/26.
 */
public class VueListGenerator extends GeneratorConfig{

    public Boolean genGeratorCode(List<TableColumnInfo> tableColumnInfos, JDBCGenerator jdbcGenerator, SysDatabases sysDatabases, String path) {
        String tableName = jdbcGenerator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        String customMapping = "/";
        Map<String, Object> data = DataUtils.getDataMapInit(tableName, tableColumnInfos, sysDatabases);
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("codeSearchList",codeSearchList(tableColumnInfos));
        data.put("seeModelList",seeModelList(tableColumnInfos));
        data.put("addModelList",addModelList(tableColumnInfos));
        data.put("editModelList",editModelList(tableColumnInfos,StringUtils.tableNameConvertLowerCamel(tableName)));
        data.put("returnModel",returnModel(tableColumnInfos));
        data.put("searchModelList",searchModelList(tableColumnInfos));
        data.put("searchModel",searchModel(tableColumnInfos));
        data.put("saveModel",saveModel(tableColumnInfos));
        data.put("editModel",editModel(tableColumnInfos));
        data.put("dataInfo",StringUtils.tableNameConvertLowerCamel(tableName)+"Info : {},");
        try {
            File controllerFile = new File(path +customMapping+sysDatabases.getDirectoryPrefix()+customMapping+"vue"+customMapping+ StringUtils.tableNameConvertLowerCamel(tableName) + ".vue");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("vueList.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "vueList.vue 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("vueList.vue 生成失败!", e);
        }
        return true;
    }

    public String codeSearchList(List<TableColumnInfo> tableColumnInfos){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_TIME","CREATE_ID","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        int i = 0;
        int size = tableColumnInfos.size();
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                if(i==size){
                    stringBuilder.append(space5).append("<el-input v-model=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("\" placeholder=\"").append(ti.getRemarks()).append("\" clearable></el-input>");
                }else {
                    stringBuilder.append(space5).append("<el-input v-model=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("\" placeholder=\"").append(ti.getRemarks()).append("\" clearable></el-input>").append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    public String searchModelList(List<TableColumnInfo> tableColumnInfos){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_TIME","CREATE_ID","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        int i = 0;
        int size = tableColumnInfos.size();
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                stringBuilder.append(space5).append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" : ").append("this.").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(",").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String searchModel(List<TableColumnInfo> tableColumnInfos){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_TIME","CREATE_ID","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space4 = "                ";
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                stringBuilder.append(space4).append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" : '',").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String seeModelList(List<TableColumnInfo> tableColumnInfos){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        int i = 0;
        int size = tableColumnInfos.size();
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                if(i==size){
                    stringBuilder.append(space5).append("<el-table-column prop=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("\" align=\"center\" label=\"").append(ti.getRemarks()).append("\" width=\"120px;\"></el-table-column>");
                }else {
                    stringBuilder.append(space5).append("<el-table-column prop=\"").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("\" align=\"center\" label=\"").append(ti.getRemarks()).append("\" width=\"120px;\"></el-table-column>").append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    public String addModelList(List<TableColumnInfo> tableColumnInfos){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","CREATE_TIME","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        String space6 = "                        ";
        int i = 0;
        int size = tableColumnInfos.size();
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                if(i==size){
                    stringBuilder.append(space5).append("<el-form-item label=\"").append(ti.getRemarks()).append("：\" required").append(">\n");
                    stringBuilder.append(space6).append("<el-input v-model=\"add").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("\" size=\"1\" style=\"width:200px;\"></el-input>").append("\n");
                    stringBuilder.append(space5).append("</el-form-item>");
                }else {
                   stringBuilder.append(space5).append("<el-form-item label=\"").append(ti.getRemarks()).append("：\" required").append(">\n");
                   stringBuilder.append(space6).append("<el-input v-model=\"add").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("\" size=\"1\" style=\"width:200px;\"></el-input>").append("\n");
                   stringBuilder.append(space5).append("</el-form-item>").append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    public String editModelList(List<TableColumnInfo> tableColumnInfos,String someTable){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","CREATE_TIME","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        String space6 = "                        ";
        int i = 0;
        int size = tableColumnInfos.size();
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                if(i==size){
                    stringBuilder.append(space5).append("<el-form-item label=\"").append(ti.getRemarks()).append("：\" required").append(">\n");
                    stringBuilder.append(space6).append("<el-input v-model=\"").append(someTable).append("Info.").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("\" size=\"1\" style=\"width:200px;\"></el-input>").append("\n");
                    stringBuilder.append(space5).append("</el-form-item>");
                }else {
                    stringBuilder.append(space5).append("<el-form-item label=\"").append(ti.getRemarks()).append("：\" required").append(">\n");
                    stringBuilder.append(space6).append("<el-input v-model=\"").append(someTable).append("Info.").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("\" size=\"1\" style=\"width:200px;\"></el-input>").append("\n");
                    stringBuilder.append(space5).append("</el-form-item>").append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }


    public String returnModel(List<TableColumnInfo> tableColumnInfos){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","CREATE_TIME","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space4 = "                ";
        int i = 0;
        int size = tableColumnInfos.size();
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                stringBuilder.append(space4).append("add").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(" : '',").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String saveModel(List<TableColumnInfo> tableColumnInfos){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","CREATE_TIME","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        int i = 0;
        int size = tableColumnInfos.size();
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                stringBuilder.append(space5).append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" : this.add").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(",").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String editModel(List<TableColumnInfo> tableColumnInfos){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","CREATE_TIME","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        int i = 0;
        int size = tableColumnInfos.size();
        //生成基础
        for(TableColumnInfo ti : tableColumnInfos){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                stringBuilder.append(space5).append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append(" : this.").append(StringUtils.tableNameConvertLowerCamel(ti.getColumnName())).append("Info.").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(",").append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
