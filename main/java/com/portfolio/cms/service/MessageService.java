package com.portfolio.cms.service;
import com.portfolio.cms.entity.Message;
import com.portfolio.cms.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    // Get all messages
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    // Get message by ID
    public Message getMessageById(Long id) {
        return messageRepository.findById(id).orElse(null);
    }

    // Add new message
    public Message addMessage(Message message) {
        return messageRepository.save(message);
    }

    // Update message
    public Message updateMessage(Long id, Message message) {
        message.setId(id);
        return messageRepository.save(message);
    }

    // Delete message
    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }
}
