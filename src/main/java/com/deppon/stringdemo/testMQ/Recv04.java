package com.deppon.stringdemo.testMQ;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.QueueingConsumer.Delivery;

/**
 * 消息持久化
 * @author menghh
 *
 */
public class Recv04 {

    public static void main(String[] args) throws Exception{
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("lz");
        factory.setPassword("123");
        factory.setHost("127.0.0.1");
        Connection conn = factory.newConnection();
        Channel channel = conn.createChannel();
        String queueName = "queue01";
        channel.queueDeclare(queueName, true, false, false, null);
        //以上部分和sender一样
        //配置好获取消息得方式
        QueueingConsumer consumer =  new QueueingConsumer(channel);
        channel.basicConsume(queueName, false,consumer);
        //循环获取消息
        while(true){
            //获取消息，如果没有消息，这一步将会一直阻塞
            Delivery delivery = consumer.nextDelivery();
            String msg = new String(delivery.getBody());
            //确认消息，已经收到
            channel.basicAck(delivery.getEnvelope().getDeliveryTag(),false);
            System.out.println("received message["+msg+"] from "+queueName);
        }
    }
}
