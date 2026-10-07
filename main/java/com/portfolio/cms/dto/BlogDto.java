package com.portfolio.cms.dto;
public class BlogDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private String publishedDate;

    // Getter and Setter for id
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    // Getter and Setter for title
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    // Getter and Setter for content
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    // Getter and Setter for author
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    // Getter and Setter for publishedDate
    public String getPublishedDate() { return publishedDate; }
    public void setPublishedDate(String publishedDate) { this.publishedDate = publishedDate; }
}