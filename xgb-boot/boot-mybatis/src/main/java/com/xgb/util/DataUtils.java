package com.xgb.util;

import com.xgb.entity.TableColumnInfo;
import com.xgb.model.SysDatabases;

import java.text.SimpleDateFormat;
import java.util.*;

public class DataUtils {

    /**
     * 预置页面所需数据
     *
     * @param tableName 表名
     * @return
     */
    public static Map<String, Object> getDataMapInit(String tableName, List<TableColumnInfo> tableColumnInfos, SysDatabases sysDatabases) {
        boolean isString = false;
        boolean isDatetime = false;
        boolean isInt = false;
        boolean isDecimal = false;
        boolean isDate = false;
        for (TableColumnInfo ti :tableColumnInfos){
            if("VARCHAR".equals(ti.getTypeName())){
                isString = true;
            }else if("DATETIME".equals(ti.getTypeName())||"DATE".equals(ti.getTypeName())){
                isDatetime = true;
            }else if("INT".equals(ti.getTypeName())||"LONG".equals(ti.getTypeName())){
                isInt = true;
            }else if("DECMIAL".equals(ti.getTypeName())){
                isDecimal = true;
            }else if("DATE".equals(ti.getTypeName())){
                isDate = true;
            }
        }
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("isString",isString);
        data.put("isDatetime",isDatetime);
        data.put("isInt",isInt);
        data.put("isDecimal",isDecimal);
        data.put("isDate",isDate);
        data.put("date", DateUtils.getNowDateToString());
        data.put("author", sysDatabases.getNickName());
        data.put("tableName", tableName);
        data.put("oneUpTableName", StringUtils.tableNameConvertUpperCamel(tableName));
        data.put("oneSomeTablelName", StringUtils.tableNameConvertLowerCamel(tableName));
        return data;
    }


    public static List<TableColumnInfo> xmlDataFormat(List<TableColumnInfo> tableInformation){
        List<TableColumnInfo> tableColoms = new ArrayList<>();
        tableInformation.forEach(item->{
            if(item.getTypeName().equals("DATETIME")){
                item.setTypeName("TIMESTAMP");
            }
            tableColoms.add(item);
        });
        return tableColoms;
    }
}
