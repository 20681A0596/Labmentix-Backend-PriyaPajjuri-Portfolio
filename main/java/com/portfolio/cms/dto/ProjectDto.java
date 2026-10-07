package com.portfolio.cms.dto;



public class ProjectDto {
    private Long id;
    private String title;
    private String description;
    private String link;

    // Getter and Setter for id
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    // Getter and Setter for title
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    // Getter and Setter for description
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    // Getter and Setter for link
    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }
}