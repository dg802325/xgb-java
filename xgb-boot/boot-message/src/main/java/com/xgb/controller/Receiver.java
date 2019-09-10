package com.xgb.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;

/**
 * @Auther: 邓根
 * @Date: 2019/9/10 19:36
 * @Description:
 */
@Component
public class Receiver {

    @RabbitListener(queues = "delay_queue")
    public void orderUpdate(Map<String, String> map) {
        System.out.println(map);
    }

    @RabbitListener(queues = "delay_queue1")
    public void orderUpd(Map<String, String> map) {
        System.out.println(map);
    }

    @RabbitListener(queues = "delay_queue2")
    public void orderSh(Map<String, String> map) {
        System.out.println(map);
    }
    @RabbitListener(queues = "delay_queue3")
    public void orderGq(Map<String, String> map) {
        System.out.println(map);
    }


    public static String randomString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        StringBuilder builder = new StringBuilder(sdf.format(new Date()));
        String[] beforeShuffle = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random rd = new Random();
        for (int i = 0; i < 8; i++) {
            int j = rd.nextInt(beforeShuffle.length);
            builder.append(beforeShuffle[j]);
        }
        return builder.toString();
    }

    @RabbitListener(queues = "es-sku-add")    //监听器监听指定的Queue
    public void skuAdd(Map<String, Object> map) {
        System.out.println(map);
    }
    @RabbitListener(queues = "es-sku-update")    //监听器监听指定的Queue
    public void skuUpdate(Map<String, Object> map) {
        System.out.println(map);
    }
    @RabbitListener(queues = "es-sku-delete")    //监听器监听指定的Queue
    public void skuDelete(Map<String, Object> map) {
        System.out.println(map);
    }
}
