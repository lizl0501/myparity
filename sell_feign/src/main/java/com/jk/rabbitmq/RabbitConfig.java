package com.jk.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//声明当前类是一个配置文件类 相当于spring.xml配置文件
public class RabbitConfig {

    @Bean//创建一个rabbitMq队列
        //@Bean 声明当前方法为bean实例方法 把返回值注入到spring环境中
    public Queue queueMessages() {
        //参数为队列名称
        return new Queue("myqueue");
    }
}
