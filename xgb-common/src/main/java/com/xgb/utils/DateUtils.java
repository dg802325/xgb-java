package com.xgb.utils;

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

}
