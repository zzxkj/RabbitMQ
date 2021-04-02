package com.example.demo.Queue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//监听Queue1队列,发送者的Queue名称必须一致，否则不能接受
@Component
@RabbitListener(queues = "queue")
public class ReceiverA {
    //@RabbitHandler来实现具体消费
    @RabbitHandler
    public void QueueReceiver(String Queue1) {
        System.out.println("Receiver A:" + Queue1);
    }
}
