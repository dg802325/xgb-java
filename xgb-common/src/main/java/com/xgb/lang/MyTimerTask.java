package com.xgb.lang;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    private String name;
    public MyTimerTask(String inputName){
        name = inputName;
    }
    @Override
    public void run() {
        //以yyyy-MM-dd HH:mm:ss的格式打印当前执行的时间
        //如2018-11-09 22：00：00
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current exec time is:"+sf.format(calendar.getTime()));
        //打印当前name的内容
        System.out.println("Current exec name is:"+name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
