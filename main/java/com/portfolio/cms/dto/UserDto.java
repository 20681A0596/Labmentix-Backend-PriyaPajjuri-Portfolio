package com.portfolio.cms.dto;
/*
public class UserDto {
    private Long id;
    private String username;
    private String role;

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for role
    public String getRole() {
        return role;
    }

    // Setter for role
    public void setRole(String role) {
        this.role = role;
    }
}*/

public class UserDto {
    private String email;
    private String role;

    // Getter and Setter for username
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for role
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}

