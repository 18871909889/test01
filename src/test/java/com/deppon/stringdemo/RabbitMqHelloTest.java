package com.deppon.stringdemo;

import com.deppon.stringdemo.testMQ.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述：
 *
 * @author : lizhao
 * @Title: LI
 * @Package: com.deppon.stringdemo
 * @ProjectName string-demo
 * @Description: TODO
 * @date 2018-12-19  15:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }

}
