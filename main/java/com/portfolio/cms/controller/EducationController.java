package com.portfolio.cms.controller;



import com.portfolio.cms.entity.Education;
import com.portfolio.cms.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/education")
public class EducationController {
    @Autowired private EducationService service;

    @GetMapping
    public List<Education> getAll() { return service.getAll(); }

    @PostMapping
    public Education add(@RequestBody Education edu) { return service.save(edu); }
}