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
 * VueList层 代码生成器 Created by xgb on 2019/07/26.
 */
public class VueListGenerator extends CodeGeneratorManager implements CodeGenerator {

    @Override
    public void genGeratorCode(List<TableInformation> tableInformation, Generator generator, SysDatabases sysDatabases,String path) {
        String tableName = generator.getTableName();
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        Configuration cfg = getFreemarkerConfiguration();
        String customMapping = "/";
        Map<String, Object> data = DataUtil.getDataMapInit(tableName, modelName,tableInformation,sysDatabases);
        data.put("modelPackage",sysDatabases.getDirectoryPrefix()+".model");
        data.put("vueTableName",generator.getTableRemark()+"管理");//表备注作为查询管理名称
        data.put("codeSearchList",codeSearchList(tableInformation));
        data.put("addLabel","添加"+generator.getTableRemark());
        data.put("seeModelList",seeModelList(tableInformation));
        data.put("addModelList",addModelList(tableInformation));
        data.put("editModelList",editModelList(tableInformation,StringUtils.lineToHump(tableName)));
        data.put("returnModel",returnModel(tableInformation));
        data.put("searchModelList",searchModelList(tableInformation));
        data.put("searchModel",searchModel(tableInformation));
        data.put("saveModel",saveModel(tableInformation));
        data.put("editModel",editModel(tableInformation));
        data.put("dataInfo",StringUtils.lineToHump(tableName)+"Info : {},");
        try {
            File controllerFile = new File(path +customMapping+sysDatabases.getDirectoryPrefix()+customMapping+"vue"+customMapping+ StringUtils.lineToHump(tableName) + ".vue");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("vueList.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelName + "vueList.vue 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("vueList.vue 生成失败!", e);
        }
    }

    public String codeSearchList(List<TableInformation> tableInformation){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_TIME","CREATE_ID","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        int i = 0;
        int size = tableInformation.size();
        //生成基础
        for(TableInformation ti : tableInformation){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                if(i==size){
                    stringBuilder.append(space5).append("<el-input v-model=\"").append(StringUtils.lineToHump(ti.getColumnName())).append("\" placeholder=\"").append(ti.getRemarks()).append("\" clearable></el-input>");
                }else {
                    stringBuilder.append(space5).append("<el-input v-model=\"").append(StringUtils.lineToHump(ti.getColumnName())).append("\" placeholder=\"").append(ti.getRemarks()).append("\" clearable></el-input>").append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    public String searchModelList(List<TableInformation> tableInformation){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_TIME","CREATE_ID","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        int i = 0;
        int size = tableInformation.size();
        //生成基础
        for(TableInformation ti : tableInformation){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                stringBuilder.append(space5).append(StringUtils.lineToHump(ti.getColumnName())).append(" : ").append("this.").append(StringUtils.lineToHump(ti.getColumnName())).append(",").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String searchModel(List<TableInformation> tableInformation){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_TIME","CREATE_ID","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space4 = "                ";
        //生成基础
        for(TableInformation ti : tableInformation){
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                stringBuilder.append(space4).append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(" : '',").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String seeModelList(List<TableInformation> tableInformation){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        int i = 0;
        int size = tableInformation.size();
        //生成基础
        for(TableInformation ti : tableInformation){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                if(i==size){
                    stringBuilder.append(space5).append("<el-table-column prop=\"").append(StringUtils.lineToHump(ti.getColumnName())).append("\" align=\"center\" label=\"").append(ti.getRemarks()).append("\" width=\"120px;\"></el-table-column>");
                }else {
                    stringBuilder.append(space5).append("<el-table-column prop=\"").append(StringUtils.lineToHump(ti.getColumnName())).append("\" align=\"center\" label=\"").append(ti.getRemarks()).append("\" width=\"120px;\"></el-table-column>").append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    public String addModelList(List<TableInformation> tableInformation){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","CREATE_TIME","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        String space6 = "                        ";
        int i = 0;
        int size = tableInformation.size();
        //生成基础
        for(TableInformation ti : tableInformation){
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

    public String editModelList(List<TableInformation> tableInformation,String someTable){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","CREATE_TIME","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        String space6 = "                        ";
        int i = 0;
        int size = tableInformation.size();
        //生成基础
        for(TableInformation ti : tableInformation){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                if(i==size){
                    stringBuilder.append(space5).append("<el-form-item label=\"").append(ti.getRemarks()).append("：\" required").append(">\n");
                    stringBuilder.append(space6).append("<el-input v-model=\"").append(someTable).append("Info.").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("\" size=\"1\" style=\"width:200px;\"></el-input>").append("\n");
                    stringBuilder.append(space5).append("</el-form-item>");
                }else {
                    stringBuilder.append(space5).append("<el-form-item label=\"").append(ti.getRemarks()).append("：\" required").append(">\n");
                    stringBuilder.append(space6).append("<el-input v-model=\"").append(someTable).append("Info.").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append("\" size=\"1\" style=\"width:200px;\"></el-input>").append("\n");
                    stringBuilder.append(space5).append("</el-form-item>").append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }


    public String returnModel(List<TableInformation> tableInformation){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","CREATE_TIME","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space4 = "                ";
        int i = 0;
        int size = tableInformation.size();
        //生成基础
        for(TableInformation ti : tableInformation){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                stringBuilder.append(space4).append("add").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(" : '',").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String saveModel(List<TableInformation> tableInformation){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","CREATE_TIME","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        int i = 0;
        int size = tableInformation.size();
        //生成基础
        for(TableInformation ti : tableInformation){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                stringBuilder.append(space5).append(StringUtils.lineToHump(ti.getColumnName())).append(" : this.add").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(",").append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String editModel(List<TableInformation> tableInformation){
        //需要排除的字符串
        String[] columns = {"ID","CREATE_ID","CREATE_TIME","UPDATE_TIME","UPDATE_ID","STATUS","IS_DEL"};
        StringBuilder stringBuilder = new StringBuilder();
        String space5 = "                    ";
        int i = 0;
        int size = tableInformation.size();
        //生成基础
        for(TableInformation ti : tableInformation){
            i++;
            if(!StringUtils.stringIsOnArray(ti.getColumnName(),columns)){
                stringBuilder.append(space5).append(StringUtils.lineToHump(ti.getColumnName())).append(" : this.").append(StringUtils.lineToHump(ti.getColumnName())).append("Info.").append(StringUtils.tableNameConvertUpperCamel(ti.getColumnName())).append(",").append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
