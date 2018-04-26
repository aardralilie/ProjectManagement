package com.pm.service;

import java.util.List;

import com.pm.model.Task;

public interface TaskService {

	public Task addUpdateTask(Task task);

	public List<Task> getAllTasks();

}
