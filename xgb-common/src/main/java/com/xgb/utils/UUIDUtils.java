package com.xgb.utils;

import java.util.UUID;

public class UUIDUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().toUpperCase().replace("-", "");
    }
}
