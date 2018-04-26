package com.pm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pm.model.ParentTask;
import com.pm.model.Project;
import com.pm.repository.ParentTaskRepository;
import com.pm.repository.ProjectRepository;
import com.pm.service.ParentTaskService;
import com.pm.service.ProjectService;

@Service
public class ParentTaskServiceImpl implements ParentTaskService {

	
	@Autowired
	ParentTaskRepository parentTaskRepository;
	
	@Override
	public ParentTask addUpdateParentTask(ParentTask parentTask) {
		return parentTaskRepository.save(parentTask);
	}

	@Override
	public List<ParentTask> getallParentTasks() {
		return (List<ParentTask>) parentTaskRepository.findAll();
		 
	}

	
	

	

	

	
}
