package com.xgb.lang;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @Auther: 邓根
 * @Date: 2019/9/21 11:42
 * @Description:
 */
public class DateUtils {

    public static Date getNowDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }
}
