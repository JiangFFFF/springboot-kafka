package com.jiang.springboot.springbootkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * kafka生产者
 * @author jiang
 * @create 2022-07-03-1:33 下午
 */
@RestController
public class ProducerController {

    @Autowired(required = false)
    private KafkaTemplate<String,String> kafkaTemplate;

    @RequestMapping("/atguigu")
    public String data(String msg){
        //通过kafka发送出去
        kafkaTemplate.send("first",msg);
        return "ok";
    }
}
