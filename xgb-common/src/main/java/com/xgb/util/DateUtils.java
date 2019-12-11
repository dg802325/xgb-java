package com.xgb.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Auther: 邓根
 * @Date: 2019/9/21 11:42
 * @Description:
 */
public class DateUtils {

    /**
     * 获得当前时间
     * @return
     */
    public static Date getNowDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

    /**
     * 获得格式化成 20190925123456 类型的时间
     * @return
     */
    public static String getNowDateFormatyyyyMMddHHmmss(){
        //格式化日期
        DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter HHmmss = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime now1 = LocalTime.now().withNano(0);//18:18:37
        String format = LocalDate.now().format(yyyyMMdd)+now1.format(HHmmss);
        return format;
    }

    /**
     * 获得格式化成 20190925123456 类型的时间
     * @return
     */
    public static String getNowDateToString(){
        //格式化日期
        DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        DateTimeFormatter HHmmss = DateTimeFormatter.ofPattern(" HH:mm:ss");
        LocalTime now1 = LocalTime.now().withNano(0);//18:18:37
        String format = LocalDate.now().format(yyyyMMdd)+now1.format(HHmmss);
        return format;
    }


    public static Date tzStringToDate(String dateString) throws ParseException {
        dateString = dateString.replace("Z", " UTC");//注意是空格+UTC
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");//注意格式化的表达式
        Date d = format.parse(dateString);
        return d;
    }

}