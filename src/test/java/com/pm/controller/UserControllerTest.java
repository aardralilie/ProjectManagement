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
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.pm.controller.UserController;
import com.pm.model.User;
import com.pm.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserService userservice;


	
	@Test
	public void getAllUsersTest() throws Exception {
		User user = new User();
		user.setFirstName("firstName");
		user.setLastName("lastName");
		
		User user2 = new User();
		user.setFirstName("firstName2");
		user.setLastName("lastName2");
		List<User> userlist = new ArrayList<User>();
		userlist.add(user);
		userlist.add(user2);
		when(userservice.getAllUsers()).thenReturn(userlist);
		this.mockMvc.perform(get("/user/getAllUsers"))			
			.andExpect(status().isOk());
			//.andExpect(jsonPath("$.firstName",is("firstName")));
			
					
	}

}
