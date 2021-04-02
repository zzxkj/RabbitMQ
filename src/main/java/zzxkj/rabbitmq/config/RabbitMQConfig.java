package zzxkj.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {
    /**
     * 配置队列
     */
    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }
}
