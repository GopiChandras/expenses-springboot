package com.example.Service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.User;
import com.example.Repository.UserRepository;
import com.example.Service.UserService;
@Service
public class UserServiceImpl  implements UserService{
	@Autowired
	public UserRepository userRepository;

	@Override
	public User addUser(User newUser) {
		
		return userRepository.save(newUser);
	}

	@Override
	public List<User> getUsers() {
		
		return userRepository.findAll();
	}

	
	

	
}
