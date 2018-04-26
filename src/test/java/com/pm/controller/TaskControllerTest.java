package com.pm.controller;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.pm.controller.TaskController;
import com.pm.model.ParentTask;
import com.pm.model.Project;
import com.pm.model.Task;
import com.pm.model.User;
import com.pm.service.ParentTaskService;
import com.pm.service.TaskService;
import com.pm.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(TaskController.class)
public class TaskControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TaskService taskService;
	
	@MockBean
	private ParentTaskService parentTaskService;

	
	@Test
	public void updateUserTest() throws Exception {
		ParentTask pt = new ParentTask();
		pt.setParentName("ParentTask");
		Task t1 = new Task();
		t1.setTaskName("task1");
		when(parentTaskService.addUpdateParentTask(pt)).thenReturn(pt);
		when(parentTaskService.addUpdateParentTask(pt)).thenReturn(pt);
		 MockHttpServletRequestBuilder builder =
                 MockMvcRequestBuilders.post("/task/updateTask")
                                 .contentType(MediaType.APPLICATION_JSON);
                                //.andExpect(status().isOk());
                                 /*.content(createUserInJson("joe",
                                                           "joe@example.com",
                                                           "abc"));

		this.mockMvc.perform(post("/project/updateProject"))
		.contentType(MediaType.APPLICATION_JSON)
        .body(IntegrationTestUtil.convertObjectToJsonBytes(pr1))
			.andExpect(status().isOk());*/
			//.andExpect(jsonPath("$.firstName",is("firstName")));
			
					
	}
	@Test
	public void greetingShouldReturnMessageFromService() throws Exception {
		
		List<ParentTask> ptlist = new ArrayList<>();
		ParentTask pt = new ParentTask();
		pt.setParentName("ParentTask");
		ParentTask pt2 = new ParentTask();
		pt2.setParentName("ParentTask2");
		ptlist.add(pt);
		ptlist.add(pt2);
		when(parentTaskService.getallParentTasks()).thenReturn(ptlist);
		this.mockMvc.perform(get("/task/getAllParentTasks"))			
			.andExpect(status().isOk());
		
			//.andExpect(jsonPath("$.firstName",is("firstName")));
			
					
	}
	
	@Test
	public void getAllUsersTest() throws Exception {
		List<Task> tlist = new ArrayList<>();
		ParentTask pt = new ParentTask();
		pt.setParentName("parenttask");
		Project pr = new Project();
		pr.setProjectName("project");
		User user = new User();
		user.setFirstName("f");
		Task t1 = new Task();
		t1.setTaskName("task1");
		t1.setParentTask(pt);
		t1.setProject(pr);
		t1.setUser(user);
		Task t2 = new Task();
		t2.setTaskName("task2");
		t2.setParentTask(pt);
		t2.setProject(pr);
		t2.setUser(user);
		tlist.add(t1);
		tlist.add(t2);
		
		when(taskService.getAllTasks()).thenReturn(tlist);
		this.mockMvc.perform(get("/task/getAllTasks"))			;
			//.andExpect(status().isOk());
			//.andExpect(jsonPath("$.firstName",is("firstName")));
			
					
	}

}
