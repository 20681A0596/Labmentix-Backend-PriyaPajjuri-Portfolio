package com.portfolio.cms.service;
import com.portfolio.cms.entity.Blog;
import com.portfolio.cms.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    // Get all blogs
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    // Get blog by ID
    public Blog getBlogById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    // Add new blog
    public Blog addBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    // Update blog
    public Blog updateBlog(Long id, Blog blog) {
        blog.setId(id);
        return blogRepository.save(blog);
    }

    // Delete blog
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }
}
