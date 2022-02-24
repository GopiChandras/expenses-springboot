package com.example.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.User;
import com.example.Repository.UserRepository;
import com.example.Service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	 @Autowired
	 public UserService userService;
	 @Autowired
	 private UserRepository userRepository;
	 
	 @PostMapping("/add")
	 public User addUser(@RequestBody User data) {
		 return this.userService.addUser(data);
	 }
	 @GetMapping
	 public List<User> getUser(){
		 return userService.getUsers();
	 }
	 

}
