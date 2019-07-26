package com.xgb.utils;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author hzhlu
 *         <p>
 *         存放多个主键序列器
 *         主键形式：【前缀】-【启动时间戳】-【递增序号】
 *         递增序号：初始化时随机取值，以后+1递增
 */
public class MasterKeyID {

    static HashMap<String, AtomicLong> mapSequence = new HashMap<String, AtomicLong>();

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
