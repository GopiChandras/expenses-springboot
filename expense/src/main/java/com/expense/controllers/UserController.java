package com.expense.controllers;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expense.models.Users;
import com.expense.repository.UsersRepository;
import com.expense.services.UserService;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@Autowired
	 
	private UsersRepository usersRepository;
	
	@PostMapping("/add")
	public Users addUser(@RequestBody Users data) { 
		return this.userService.addUser(data);	

	}
	@GetMapping
 public List<Users> getUsers(){
	 return userService.getUsers();
 }
	@GetMapping("{id}")
	public ResponseEntity<Users>getUserById(@PathVariable("id") long id){
		return new ResponseEntity<Users>(userService.getUsersById(id), HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Users> updateUsers(@PathVariable("id")long id,@RequestBody Users users){
		
		return new ResponseEntity<Users>(userService.updateUsers(users, id),HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteUsers(@PathVariable("id") long id){
		userService.deleteUsers(id);
		return new ResponseEntity<String>("User Deleted", HttpStatus.OK);
	}
	@PostMapping("/add1")
	public Users savePost(@RequestBody Users newUsers) {
		
		newUsers = this.usersRepository.save(newUsers);
		return newUsers;
	}
	@GetMapping("/get1")
	public List<Users> getAllUsers() {
		List<Users> usersList = new ArrayList<>();
	usersList = this.usersRepository.findAll();
		return usersList;
	}
	
}
