package com.xgb.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class UUIDUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().toUpperCase().replace("-", "");
    }

    public static String getUUNo(){


        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        StringBuilder builder = new StringBuilder(sdf.format(new Date()));
        String[] beforeShuffle = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            int j = rd.nextInt(beforeShuffle.length);
            builder.append(beforeShuffle[j]);
        }
        return builder.toString();
    }
}
