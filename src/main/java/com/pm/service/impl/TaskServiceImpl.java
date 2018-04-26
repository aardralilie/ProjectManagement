package com.pm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pm.model.Project;
import com.pm.model.Task;
import com.pm.model.User;
import com.pm.repository.TaskRepository;
import com.pm.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskRepository taskRepository;

	

	@Override
	public Task addUpdateTask(Task task) {		
		return taskRepository.save(task);
	}

	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	

	
}
