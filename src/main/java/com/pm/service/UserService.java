package com.pm.service;

import java.util.List;

import com.pm.model.User;

public interface UserService {


	public User addUpdateUser(User user);

	public List<User> getAllUsers();

}
