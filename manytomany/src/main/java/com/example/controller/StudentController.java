package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.Studentservice;

@RestController
@RequestMapping("St")
public class StudentController {
     @Autowired
	public Studentservice studentservice;
     @Autowired
     private StudentRepository studentRepository;
     
     @PostMapping("/add")
     public Student addStudent(@RequestBody Student data) {
    	 return studentservice.addStudent(data);
     }
	
}
