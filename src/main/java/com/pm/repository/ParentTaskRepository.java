package com.pm.repository;

import org.springframework.data.repository.CrudRepository;

import com.pm.model.ParentTask;

public interface ParentTaskRepository extends CrudRepository<ParentTask, Long> {
	
}
