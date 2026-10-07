package com.portfolio.cms.dto;
public class MediaDto {
    private Long id;
    private String fileName;
    private String url;
    private String type;

    // Getter and Setter for id
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    // Getter and Setter for fileName
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    // Getter and Setter for url
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    // Getter and Setter for type
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
