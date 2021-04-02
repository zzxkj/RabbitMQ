package com.example.demo.controller;

import com.example.demo.Queue.QueueSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ControllerSend {
    @Autowired
    private QueueSend queueSend;
    @GetMapping("/")
    public void send(){
        /*
         *连续发送两个消息
        * */
        String data = "queue的message:->" + new Date();
        for (int i = 0; i < 2; i++) {}
            try {
                queueSend.send(data);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
