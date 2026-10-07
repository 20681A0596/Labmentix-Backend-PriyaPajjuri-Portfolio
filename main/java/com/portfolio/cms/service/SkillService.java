package com.portfolio.cms.service;
import com.portfolio.cms.entity.Skill;
import com.portfolio.cms.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    // Get all skills
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    // Get skill by ID
    public Skill getSkillById(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

    // Add new skill
    public Skill addSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    // Update skill
    public Skill updateSkill(Long id, Skill skill) {
        skill.setId(id);
        return skillRepository.save(skill);
    }

    // Delete skill
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }
}
