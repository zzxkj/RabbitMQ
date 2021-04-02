package zzxkj.rabbitmq.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zzxkj.rabbitmq.entity.User;

@Component
public class ObjectSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(User user) {
        System.out.println("Sender object: " + user.toString());
        amqpTemplate.convertAndSend("object", user);
    }

}
