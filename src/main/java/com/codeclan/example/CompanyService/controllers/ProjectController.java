package com.codeclan.example.CompanyService.controllers;

import com.codeclan.example.CompanyService.models.Project;
import com.codeclan.example.CompanyService.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Project> getProjectByID(@PathVariable Long id){
        return projectRepository.findById(id);
    }
}
