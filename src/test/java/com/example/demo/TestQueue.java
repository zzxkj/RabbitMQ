package com.example.demo;

import com.example.demo.Queue.QueueSend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class TestQueue {
    @Autowired
    private QueueSend queueSend;

    @Test
    public void Send() {
        String data = "Queue1的message:->" + new Date();
        for (int i = 0; i < 2; i++) {
            try {
                queueSend.send(data);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

