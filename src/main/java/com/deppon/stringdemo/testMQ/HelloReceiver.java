package com.deppon.stringdemo.testMQ;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 描述：
 *
 * @author : lizhao
 * @Title: Li
 * @Package: com.deppon.stringdemo.testMQ
 * @ProjectName string-demo
 * @Description: TODO
 * @date 2018-12-19  15:54
 */
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }

}
