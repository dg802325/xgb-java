package com.xgb.utils;

import java.util.Map;

public class LayUIPage {

    public static Map<String,Object> updateMap(Map<String, Object> params){
        if(MyUtils.isNotEmpty(params.get("startPage"))){
            params.put("startPage",(Integer.valueOf((String)params.get("startPage"))-1)*Integer.valueOf((String)params.get("endPage")));
        }
        if(MyUtils.isNotEmpty(params.get("endPage"))){
            params.put("endPage",Integer.valueOf((String)params.get("endPage")));
        }
        return params;
    }
}
