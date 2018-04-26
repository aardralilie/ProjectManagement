package com.pm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ParentTask {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long parentId;
	
	private String parentName;
	/*@ManyToOne
	Task childTask;*/

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	

	/*public Task getChildTask() {
		return childTask;
	}

	public void setChildTask(Task childTask) {
		this.childTask = childTask;
	}*/
}
