package com.deppon.stringdemo.testMQ;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

/**
 * 消息持久化
 * @author menghh
 *
 */
public class Send04 {

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("lz");
        factory.setPassword("123");
        //RabbitMQ-Server安装在本机，所以直接用127.0.0.1
        factory.setHost("127.0.0.1");
        //创建一个连接
        Connection conn = factory.newConnection();
        //创建一个通信通道
        Channel channel = conn.createChannel();
        //定义Queue名称
        String queueName = "queue02";
        //为Channel定义queue的属性，queueName为queue名称
        channel.queueDeclare(queueName, true, false,false,null);
        String msg = "Hello World!---------------------";
        //发送消息
        /**
         * 测试条件：1、在消息队列持久化的前提下2、接收消息方设置接收方式为手动接收，并不对接收消息进行确认
         * 不采用消息持久化，重启RabbitMQ服务后，消息队列存在，消息接收不到
         * 采用消息持久化，重启RabbitMQ服务后，消息队列存在，消息依然可以接收到消息，说明消息被持久化
         */
        channel.basicPublish("", queueName, MessageProperties.PERSISTENT_TEXT_PLAIN, msg.getBytes());
//		channel.basicPublish("", queueName, null, msg.getBytes());
        System.out.println("send message["+msg+"] to "+queueName+"success!");
        //关闭通道
        channel.close();
        //关闭连接
        conn.close();
    }
}
