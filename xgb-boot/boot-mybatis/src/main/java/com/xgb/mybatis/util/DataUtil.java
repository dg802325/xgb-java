package com.xgb.mybatis.util;

import com.xgb.model.TableInformation;
import com.xgb.mybatis.service.CodeGeneratorConfig;

import java.text.SimpleDateFormat;
import java.util.*;

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
        data.put("date", date2String(new Date()));
        data.put("author", AUTHOR);
        data.put("tableName", tableName);
        data.put("modelName", modelName);
        data.put("baseRequestMapping", StringUtils.toLowerCaseFirstOne(modelName));
        return data;
    }

    static public String date2String(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(date);
    }
}
