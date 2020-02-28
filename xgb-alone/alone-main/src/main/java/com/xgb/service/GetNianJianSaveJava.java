package com.xgb.service;

import com.xgb.entity.TableColumnInfo;
import com.xgb.model.ContentAttrModel;
import com.xgb.util.MyTools;
import com.xgb.util.StringUtils;
import com.xgb.utils.DataUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class GetNianJianSaveJava extends GeneratorConfig{

    public static Boolean genGeratorCode(String path,String saveName,String tableName,List<ContentAttrModel> attr) {
        Configuration cfg = getFreemarkerConfiguration();
        Map<String, Object> data = DataUtils.getDataMapInit();
        data.put("codeEntity",codeEntity(attr,tableName));
        data.put("modelName",StringUtils.tableNameConvertUpperCamel(tableName));
        data.put("saveName",saveName);
//        data.put("codeEntity2",codeEntity2(attr,tableName));
        try {
            File controllerFile = new File(path  +SLASH+ "Save"+saveName+".java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("njSaveJava.ftl").process(data, new FileWriter(controllerFile));
        } catch (Exception e) {
            throw new RuntimeException("saveJava 生成失败!", e);
        }
        return true;
    }

//    public static String codeEntity2(List<ContentAttrModel> attr,String tableName){
//        StringBuffer buffer = new StringBuffer();
//        for (ContentAttrModel a : attr){
//            if(MyTools.isNotEmpty(a.getName())){
//                buffer.append("list.add(\"").append(a.getName()).append("\");").append("\n");
//            }
//        }
//        return buffer.toString();
//    }

    public static String codeEntity(List<ContentAttrModel> attr,String tableName){
        StringBuilder stringBuilder = new StringBuilder();
        for (ContentAttrModel cam : attr){
            if(MyTools.isNotEmpty(cam.getValue())){
                stringBuilder.append(space8).append("if(MyTools.isNotEmpty(").append("oldTable.get").append(StringUtils.tableNameConvertUpperCamel(cam.getValue())).append("())){").append("\n");
                stringBuilder.append(space12).append("jc = new JcContentAttr1();jc.setContentId(contentId);").append("\n");
                stringBuilder.append(space12).append("jc.setAttrName(\"").append(cam.getKey()).append("\");").append("\n");
                stringBuilder.append(space12).append("jc.setAttrValue(").append("oldTable.get").append(StringUtils.tableNameConvertUpperCamel(cam.getValue())).append("());").append("lists.add(jc);}").append("\n");
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }


}
