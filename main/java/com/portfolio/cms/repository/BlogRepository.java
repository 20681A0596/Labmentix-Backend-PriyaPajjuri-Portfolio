package com.portfolio.cms.repository;



import com.portfolio.cms.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {}