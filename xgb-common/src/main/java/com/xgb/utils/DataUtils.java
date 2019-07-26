package com.xgb.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DataUtils {

    /**
     * Date to String.
     *
     * @param date
     * @return yyyy-MM-dd HH:mm:ss
     */
    static public String dateToString(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(date);
    }

    /**
     * Date to string.
     *
     * @param date
     * @param pattern 格式类型 如 "yyyy-MM-dd HH:mm:ss"
     * @return date string
     */
    public static String dateToString(Date date, String pattern) {
        return new SimpleDateFormat(pattern, Locale.getDefault()).format(date);
    }

    /**
     * 计算两个时间毫秒值间的时间差，用于调优审核执行耗时
     *
     * @return
     */
    public static String leadTime(long start, long stop) {
        long diff = stop - start;
        return during(diff);
    }

    /**
     * 获得时间
     * @param diff
     * @return
     */
    public static String during(long diff) {
        long diffMS = diff % 1000;  // 毫秒
        long diffSeconds = diff / 1000 % 60;  // 秒
        long diffMinutes = diff / (60 * 1000) % 60; // 分
        long diffHours = diff / (60 * 60 * 1000) % 24; // 小时
        long diffDays = diff / (24 * 60 * 60 * 1000); // 天

        String result = "";

        if (diffDays > 0) {
            result = diffDays + "天";
            result = result + StringUtils.leftPad(Long.toString(diffHours),"0", 2) + "小时";
            result = result + StringUtils.leftPad(Long.toString(diffMinutes),"0", 2) + "分";
            result = result  + "秒";
            return result;
        } else {
            if (diffHours > 0) {
                result = diffHours + "小时";
                result = result + StringUtils.leftPad(Long.toString(diffMinutes),"0", 2) + "分";
                result = result  + "秒";
                return result;
            } else {
                if (diffMinutes > 0) {
                    result = diffMinutes + "分";
                    result = result + StringUtils.leftPad(Long.toString(diffSeconds),"0", 2) ;
                    result = result  + "秒";
                    return result;
                } else {
                    result = diffSeconds + "秒";
                    return result;
                }
            }
        }
    }

    /**
     * 给某个日期加几天后的日期 eg:2013-06-28号+1天是 2013-06-29 ，+3天是2013-07-01
     * @param date 日期
     * @param dump 数字
     * @return
     * add by xiejingjing
     */
    public static String getDateByAddSomeDay(Date date,int dump){
        Calendar ca=Calendar.getInstance();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");  //构造任意格式
        String today = sm.format(date);
        String[] timeArray= today.split("-");
        ca.set(Calendar.YEAR,Integer.parseInt(timeArray[0]));
        ca.set(Calendar.MONTH, Integer.parseInt(timeArray[1])-1);
        ca.set(Calendar.DAY_OF_MONTH,Integer.parseInt(timeArray[2]));
        ca.add(Calendar.DAY_OF_MONTH, dump);
        String someDay = sm.format(ca.getTime());
        return someDay;
    }


    /**
     * 获取当前时间 精确到毫秒
     */
    public static String getCurrentTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String currentTime = sdf.format(new Date());
        return currentTime;
    }

}
