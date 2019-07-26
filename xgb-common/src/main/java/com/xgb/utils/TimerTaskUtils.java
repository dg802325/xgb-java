package com.xgb.utils;

import com.xgb.lang.MyTimerTask;

import java.util.Calendar;
import java.util.Timer;

public class TimerTaskUtils {

    /**
     * 定时任务
     * 想要停止任务使用cancel();方法
     * 打印方法执行时间 ：使用myTimerTask.scheduledExecutionTime()方法显示第一次执行时间。
     * @return
     */
    public static void myTimerTask() {
        Calendar calendar = Calendar.getInstance();
        //1.创建timer实例
        Timer timer = new Timer();
        //2.创建一个MyTimerTask实例
        MyTimerTask myTimerTask = new MyTimerTask("No.1");
        //3.调用schedule 方法 或者 scheduleAtFixedRate方法使用延迟调用
        //schedule ：如果第一次执行时间小于当前时间，则忽略之前的时间
        //scheduleAtFixedRate：如果第一次执行时间小于当前时间，则在运行后多次执行赶上当前时间。
        timer.schedule(myTimerTask, 2000L,2000);
        timer.scheduleAtFixedRate(myTimerTask, calendar.getTime(), 2000);
    }
}
