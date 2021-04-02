package zzxkj.rabbitmq.controller;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import zzxkj.rabbitmq.entity.User;
import zzxkj.rabbitmq.mq.ObjectSender;

@RestController
public class ObjectController {
    @Autowired
    private ObjectSender sender;

    @GetMapping("/")
    public String test() {
        try {
            User user = new User();
            user.setName("zzxkj");
            user.setAge(22);
            sender.send(user);
        } catch (Exception e) {
            return "执行失败";
        }
        return "执行成功";
    }
}
