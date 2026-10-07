package com.portfolio.cms.controller;
import com.portfolio.cms.entity.Blog;
import com.portfolio.cms.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    // GET all blogs
    @GetMapping
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    // GET blog by ID
    @GetMapping("/{id}")
    public Blog getBlogById(@PathVariable Long id) {
        return blogService.getBlogById(id);
    }

    // POST add blog
    @PostMapping
    public Blog addBlog(@RequestBody Blog blog) {
        return blogService.addBlog(blog);
    }

    // PUT update blog
    @PutMapping("/{id}")
    public Blog updateBlog(@PathVariable Long id, @RequestBody Blog blog) {
        return blogService.updateBlog(id, blog);
    }

    // DELETE blog
    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable Long id) {
        blogService.deleteBlog(id);
    }
}
