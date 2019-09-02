package com.xgb.mybatisplus.util;

import com.google.common.base.CaseFormat;
import com.xgb.model.TableInformation;
import com.xgb.mybatisplus.service.CodeGeneratorConfig;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
     * @return
     */
    public static Map<String, Object> getDataMapInit(String tableName, String modelName, List<TableInformation> tableInformation) {
        boolean isString = false;
        boolean isDatetime = false;
        boolean isInt = false;
        boolean isDecimal = false;
        boolean isDate = false;
        for (TableInformation ti :tableInformation){
            if("VARCHAR".equals(ti.getTypeName())){
                isString = true;
            }else if("DATETIME".equals(ti.getTypeName())){
                isDatetime = true;
            }else if("INT".equals(ti.getTypeName())){
                isInt = true;
            }else if("DECMIAL".equals(ti.getTypeName())){
                isDecimal = true;
            }else if("DATE".equals(ti.getTypeName())){
                isDate = true;
            }
        }
        Map<String, Object> data = new HashMap<>();
        data.put("isString",isString);
        data.put("isDatetime",isDatetime);
        data.put("isInt",isInt);
        data.put("isDecimal",isDecimal);
        data.put("isDate",isDate);
        data.put("date", new Date());
        data.put("author", AUTHOR);
        data.put("tableName", tableName);
        data.put("modelName", modelName);
        data.put("baseRequestMapping", StringUtils.toLowerCaseFirstOne(modelName));
        return data;
    }
}
