package com.deppon.stringdemo.testMQ;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 描述：
 *
 * @author : lizhao
 * @Title: He
 * @Package: com.deppon.stringdemo.testMQ
 * @ProjectName string-demo
 * @Description: TODO
 * @date 2018-12-19  15:53
 */
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

}

