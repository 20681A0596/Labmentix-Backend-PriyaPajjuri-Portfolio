package com.portfolio.cms.controller;
import com.portfolio.cms.entity.Experience;
import com.portfolio.cms.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/experience")
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    // GET all experiences
    @GetMapping
    public List<Experience> getAllExperiences() {
        return experienceService.getAllExperiences();
    }

    // GET experience by ID
    @GetMapping("/{id}")
    public Experience getExperienceById(@PathVariable Long id) {
        return experienceService.getExperienceById(id);
    }

    // POST add experience
    @PostMapping
    public Experience addExperience(@RequestBody Experience experience) {
        return experienceService.addExperience(experience);
    }

    // PUT update experience
    @PutMapping("/{id}")
    public Experience updateExperience(@PathVariable Long id, @RequestBody Experience experience) {
        return experienceService.updateExperience(id, experience);
    }

    // DELETE experience
    @DeleteMapping("/{id}")
    public void deleteExperience(@PathVariable Long id) {
        experienceService.deleteExperience(id);
    }
}
