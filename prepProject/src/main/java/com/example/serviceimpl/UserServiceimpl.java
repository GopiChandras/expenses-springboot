package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceimpl implements UserService   {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User addUser(User data) {
		
		return userRepository.save(data);
	}
	
	

}
