package com.portfolio.cms.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company;   // Company name
    private String role;      // Role/Position
    private String duration;  // e.g., "Jan 2022 - Dec 2023"
    private String description; // Short description of responsibilities

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
