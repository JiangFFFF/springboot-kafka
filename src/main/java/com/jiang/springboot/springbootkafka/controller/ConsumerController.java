package com.jiang.springboot.springbootkafka.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author jiang
 * @create 2022-07-03-1:43 下午
 */
@Configuration
public class ConsumerController {

    @KafkaListener(topics = {"first"},groupId = "sringboot-consumer")
    public void consumerTopic(String msg){
        System.out.println("收到消息 "+msg);
    }
}
