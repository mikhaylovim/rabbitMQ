package org.example.controller;

import org.example.service.MessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private final MessagePublisher publisher;

    @Autowired
    public MessageController(MessagePublisher publisher) {
        this.publisher = publisher;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        publisher.sendMessage(message);
        return ResponseEntity.ok("Message sent");
    }
}

