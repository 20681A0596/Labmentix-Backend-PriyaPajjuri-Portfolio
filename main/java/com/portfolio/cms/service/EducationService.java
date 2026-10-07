package com.portfolio.cms.service;
import com.portfolio.cms.entity.Education;
import com.portfolio.cms.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    @Autowired private EducationRepository repo;

    public List<Education> getAll() { return repo.findAll(); }
    public Education save(Education edu) { return repo.save(edu); }
}