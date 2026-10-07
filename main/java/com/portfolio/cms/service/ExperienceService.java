package com.portfolio.cms.service;
import com.portfolio.cms.entity.Experience;
import com.portfolio.cms.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;

    // Get all experiences
    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }

    // Get experience by ID
    public Experience getExperienceById(Long id) {
        return experienceRepository.findById(id).orElse(null);
    }

    // Add new experience
    public Experience addExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    // Update experience
    public Experience updateExperience(Long id, Experience experience) {
        experience.setId(id);
        return experienceRepository.save(experience);
    }

    // Delete experience
    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }
}