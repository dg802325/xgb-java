package com.xgb.lang;

import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String, Object> {

    public R() {
        put("code", 200);
        put("message", "操作成功");
    }

    public static R ok(String message) {
        R r = new R();
        r.put("code","200");
        r.put("message", message);
        return r;
    }
    public static R ok() {
        R r = new R();
        r.put("code","200");
        return r;
    }

    public static R error(int code, String message) {
        R r = new R();
        r.put("code", code);
        r.put("message", message);
        return r;
    }
    public static R ok(Map<String, Object> map,String message) {
        R r = new R();
        r.put("code","200");
        r.put("message", message);
        r.putAll(map);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.put("code","200");
        r.putAll(map);
        return r;
    }

    public static R ok(String key,Object value,String message) {
        R r = new R();
        r.put("code","200");
        r.put("message", message);
        r.put(key,value);
        return r;
    }
}
