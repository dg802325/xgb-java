package com.xgb.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.CustomExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 邓根
 * @Date: 2019/9/10 19:30
 * @Description:
 */
@Configuration
public class RabbitConfig {

    /**
     * 延时队列交换机
     * 注意这里的交换机类型：CustomExchange
     *
     * @return
     */
    @Bean
    public CustomExchange delayExchange() {
        Map<String, Object> args = new HashMap<>();
        args.put("x-delayed-type", "direct");
        return new CustomExchange("delay_exchange", "x-delayed-message", true, false, args);
    }

    @Bean
    public Queue addSkuQueue() {
        return new Queue("es-sku-add");
    }
    @Bean
    public Queue updateSkuQueue() {
        return new Queue("es-sku-update");
    }
    @Bean
    public Queue deleteSkuQueue() {
        return new Queue("es-sku-delete");
    }

    /**
     * 延时队列
     *
     * @return
     */
    @Bean
    public Queue delayQueue() {
        return new Queue("delay_queue", true);
    }


    @Bean
    public Queue delayQueue1() {
        return new Queue("delay_queue1", true);
    }

    @Bean
    public Queue delayQueue2() {
        return new Queue("delay_queue2", true);
    }
    @Bean
    public Queue delayQueue3() {
        return new Queue("delay_queue3", true);
    }

    /**
     * 给延时队列绑定交换机
     *
     * @return
     */
    @Bean
    public Binding cfgDelayBinding(Queue delayQueue, CustomExchange cfgUserDelayExchange) {
        return BindingBuilder.bind(delayQueue).to(cfgUserDelayExchange).with("delay_key").noargs();
    }


    @Bean
    public Binding DelayBinding(Queue delayQueue1, CustomExchange cfgUserDelayExchange) {
        return BindingBuilder.bind(delayQueue1).to(cfgUserDelayExchange).with("delay_key1").noargs();
    }
    @Bean
    public Binding shBinding(Queue delayQueue2, CustomExchange cfgUserDelayExchange) {
        return BindingBuilder.bind(delayQueue2).to(cfgUserDelayExchange).with("delay_key2").noargs();
    }
    @Bean
    public Binding gqBinding(Queue delayQueue3, CustomExchange cfgUserDelayExchange) {
        return BindingBuilder.bind(delayQueue3).to(cfgUserDelayExchange).with("delay_key3").noargs();
    }
}
