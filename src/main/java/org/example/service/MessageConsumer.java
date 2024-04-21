package org.example.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
    private static final Logger logger = LogManager.getLogger(MessageConsumer.class);

    @RabbitListener(queues = "#{@queueName}")
    public void receiveMessage(String message) {
        logger.info("Received message: " + message);
    }
}

