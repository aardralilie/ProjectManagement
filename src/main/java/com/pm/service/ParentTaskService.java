package com.pm.service;

import java.util.List;

import com.pm.model.ParentTask;
import com.pm.model.Project;

public interface ParentTaskService {

	public ParentTask addUpdateParentTask(ParentTask parentTask);
	
	public List<ParentTask> getallParentTasks();


}
