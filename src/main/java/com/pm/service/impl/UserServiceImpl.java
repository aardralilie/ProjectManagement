package com.pm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pm.model.User;
import com.pm.repository.UserRepository;
import com.pm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	

	public List<User> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

	public User addUpdateUser(User user) {

		return userRepository.save(user);
	}

}
