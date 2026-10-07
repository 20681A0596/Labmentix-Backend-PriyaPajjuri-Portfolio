package com.portfolio.cms.service;



import com.portfolio.cms.entity.About;
import com.portfolio.cms.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService {
    @Autowired private AboutRepository repo;

    public List<About> getAll() { return repo.findAll(); }
    public About save(About about) { return repo.save(about); }
}