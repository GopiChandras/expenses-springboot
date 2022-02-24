package com.example.Service;

import java.util.List;

import com.example.Entity.User;


public interface UserService {
 
	User addUser(User newUser);
	 List<User> getUsers();
	
}
