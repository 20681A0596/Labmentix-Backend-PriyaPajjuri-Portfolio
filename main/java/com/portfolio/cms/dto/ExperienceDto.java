package com.portfolio.cms.dto;



public class ExperienceDto {
    private Long id;
    private String company;
    private String role;
    private String duration;
    private String description;

    // Getter and Setter for id
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    // Getter and Setter for company
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    // Getter and Setter for role
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    // Getter and Setter for duration
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    // Getter and Setter for description
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}