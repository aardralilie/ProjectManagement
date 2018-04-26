package com.pm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pm.model.Project;
import com.pm.repository.ProjectRepository;
import com.pm.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepository projectRepository;

	

	public List<Project> getAllProjects() {
		List<Project> projects = projectRepository.findAll();
		return projects;
	}

	public Project addUpdateProject(Project project) {

		return projectRepository.save(project);
	}

	

	
}
