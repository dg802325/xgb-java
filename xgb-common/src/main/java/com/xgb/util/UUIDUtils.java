package com.xgb.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

public class UUIDUtils {

    static HashMap<String, AtomicLong> mapSequence = new HashMap<String, AtomicLong>();

    /**
     * 获得UUID方法
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().toUpperCase().replace("-", "");
    }

    /**
     * 获得 时间戳加随机尾号的字符串
     * @return
     */
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

    /**
     * 返回 【前缀】 + "-" +  【9位时间长整型的36进制数，左补0】 + "-" + 序列号
     *
     * @param prefix
     * @return
     */
    public static String nextID(String prefix) {
        AtomicLong mySeq = mapSequence.get(prefix);
        if (mySeq == null) {
            // 首次运行时的初始化
            // String timeSeq = new SimpleDateFormat("mmss", Locale.getDefault()).format(new Date()).substring(1);
            mySeq = new AtomicLong(1);
            mapSequence.put(prefix, mySeq);
        }

        // id前缀大写，补满2位
        if (prefix == null) {
            prefix = "ID";
        }
        prefix = prefix.toUpperCase();

        // 9位时间长整型的36进制数，左补0
        String ts = "00" + Long.toString(System.currentTimeMillis(), Character.MAX_RADIX);
        int tsLen = ts.length();
        ts = ts.substring(tsLen - 9, tsLen);
        String id = prefix + "_" + ts + "_" + mySeq.getAndIncrement();
        return id;
    }
}
