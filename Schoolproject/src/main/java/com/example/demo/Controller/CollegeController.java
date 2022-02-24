package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repostery.CollegeRepo;
import com.example.demo.Service.CollegeService;
import com.example.demo.entity.College;

@RestController
@RequestMapping( "/college")
public class CollegeController {
	
	@Autowired
	public CollegeRepo collegeRepo;
	
	@Autowired
	public CollegeService collegeService;
	
	@PostMapping("/po")
	public College addCollege(@RequestBody College newUser) {
		return this.collegeService.addCollege(newUser);
	}
	
	@GetMapping("/get")
	public List<College> getCollege(){
		return collegeService.getCollege();
	}
	 @GetMapping("/get/{id}")
	 public ResponseEntity<College>getCollegeById(@PathVariable("id")Long id){
		 return new ResponseEntity<College>(collegeService.getCollegeById(id), HttpStatus.OK);
	 }
	
}

