package zzxkj.rabbitmq.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import zzxkj.rabbitmq.entity.User;

@Component
public class ObjectReceiver {
    @RabbitListener(queues = "object")
    public void process(User user) {
        System.out.println("Receive object:" + user);
    }

}
