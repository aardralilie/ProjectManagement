package com.pm.service;

import java.util.List;

import com.pm.model.Project;

public interface ProjectService {

	public Project addUpdateProject(Project project);

	public List<Project> getAllProjects();

}
