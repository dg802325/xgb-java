package com.xgb.main;

import java.util.Calendar;
import java.util.Date;

public class test {


    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int weekYear = calendar.getWeekYear();
        System.out.println(weekYear);
    }
}
