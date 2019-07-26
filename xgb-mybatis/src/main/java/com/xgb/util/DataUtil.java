package com.xgb.util;

import com.google.common.base.CaseFormat;
import com.xgb.service.CodeGeneratorConfig;

import java.util.HashMap;
import java.util.Map;

/** 
 * ClassName:DataUtil <br/> 
 * Date:     2019年7月26日 下午11:05:05 <br/>
 * @author   @author 295841112@qq.com
 * @Blog     http://www.lovexgb.com(域名是有了，就是不知道多会会用。。。。)
 * @version  
 * @see       
 */
public class DataUtil extends CodeGeneratorConfig {
    /**
     * 预置页面所需数据
     * 
     * @param tableName 表名
     * @param modelName 自定义实体类名, 为null则默认将表名下划线转成大驼峰形式
     * @param modelNameUpperCamel 首字为大写的实体类名
     * @return
     */
    public static Map<String, Object> getDataMapInit(String tableName, String modelName, String modelNameUpperCamel) {
        Map<String, Object> data = new HashMap<>();
        data.put("date", DATE);
        data.put("author", AUTHOR);
        data.put("tableName", tableName);
        data.put("baseRequestMapping", StringUtils.toLowerCaseFirstOne(modelNameUpperCamel));
        data.put("modelNameUpperCamel", modelNameUpperCamel);
        data.put("modelNameLowerCamel", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, modelNameUpperCamel));
        data.put("servicePackage", SERVICE_PACKAGE);
        data.put("modelPackage", MODEL_PACKAGE);
        data.put("controllerPackage", CONTROLLER_PACKAGE);
        data.put("mapperPackage", MAPPER_PACKAGE);
//        data.put("pageClassPath", Page.class.getName());
//        data.put("resultClassPath", Result.class.getName());
        return data;
    }
}
