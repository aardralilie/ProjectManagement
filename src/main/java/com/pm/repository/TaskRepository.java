package com.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.pm.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
	
}
