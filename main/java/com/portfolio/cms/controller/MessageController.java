package com.portfolio.cms.controller;
import com.portfolio.cms.entity.Message;
import com.portfolio.cms.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    // GET all messages
    @GetMapping
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    // GET message by ID
    @GetMapping("/{id}")
    public Message getMessageById(@PathVariable Long id) {
        return messageService.getMessageById(id);
    }

    // POST add message
    @PostMapping
    public Message addMessage(@RequestBody Message message) {
        return messageService.addMessage(message);
    }

    // PUT update message
    @PutMapping("/{id}")
    public Message updateMessage(@PathVariable Long id, @RequestBody Message message) {
        return messageService.updateMessage(id, message);
    }

    // DELETE message
    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id) {
        messageService.deleteMessage(id);
    }
}
