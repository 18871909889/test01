package com.deppon.stringdemo.fileDemo;

import com.deppon.stringdemo.enety.User;
import com.sto.ocean.mapper.JsonMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 描述：
 *
 * @author : lizhao
 * @Title: TestRabbitMQ
 * @Package: com.deppon.stringdemo.fileDemo
 * @ProjectName string-demo
 * @Description: TODO
 * @date 2018-12-19  14:10
 */
@Component
public class TestRabbitMQ{
    @Autowired
    static JsonMapper jsonMapper;

    @Autowired
    static RabbitTemplate rabbitTemplate;

    public static void main(String[] args) {
        User user = new User();
        user.setName("lizhao");
        user.setAge(23);
        addMq(user);
        System.out.println("mq添加成功！");
    }

    public static void addMq(User user ){
        rabbitTemplate.convertAndSend("bb", jsonMapper.toJson(user));
    }




}
