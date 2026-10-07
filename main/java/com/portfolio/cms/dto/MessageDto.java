package com.portfolio.cms.dto;
public class MessageDto {
    private Long id;
    private String senderName;
    private String senderEmail;
    private String message;

    // Getter and Setter for id
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    // Getter and Setter for senderName
    public String getSenderName() { return senderName; }
    public void setSenderName(String senderName) { this.senderName = senderName; }

    // Getter and Setter for senderEmail
    public String getSenderEmail() { return senderEmail; }
    public void setSenderEmail(String senderEmail) { this.senderEmail = senderEmail; }

    // Getter and Setter for message
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}