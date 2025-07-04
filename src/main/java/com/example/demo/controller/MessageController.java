package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @PostMapping
    public Message saveMessage(@RequestBody Message message) {
        return messageRepository.save(message);
    }
}
