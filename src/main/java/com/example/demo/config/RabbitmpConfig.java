package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmpConfig {

    //配置队列queue，并将队列交予IoC管理
    @Bean
    public Queue queue() {
        //参数说明：
        //durable:是否支持持久化，默认为false，持久化队列：会被存储在磁盘上，当消息代理重启时依然存在，暂存队列：当前连接有效
        //exclusive:默认也为false，只能被当前创建的连接使用，且当关闭后队列即被删除。吃参考优先级高于durable
        //autoDelete：默认false，是否自动删除，当没有生产者或消费者使用此队列时，该队列会自动删除
        //return new Queue("Queue1",true,true,false);
        //一般设置一下队列的持久化就好，其余俩默认false；
        return new Queue("queue");
    }
    /*
     * 不声明交换机则为默认交换机，为直连型交换机
    * */

}
