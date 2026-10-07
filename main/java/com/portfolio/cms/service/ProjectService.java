package com.portfolio.cms.service;
import com.portfolio.cms.entity.Project;
import com.portfolio.cms.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    // Get all projects
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // Get project by ID
    public Project getProjectById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    // Add new project
    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    // Update project
    public Project updateProject(Long id, Project project) {
        project.setId(id);
        return projectRepository.save(project);
    }

    // Delete project
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
