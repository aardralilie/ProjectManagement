package com.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pm.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
}
