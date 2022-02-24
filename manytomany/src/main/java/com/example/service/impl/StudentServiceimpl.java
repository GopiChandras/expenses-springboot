package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.Studentservice;

@Service
public class StudentServiceimpl implements Studentservice {
      @Autowired
	 StudentRepository studentRepository;
	@Override
	public Student addStudent(Student data) {
		
		return this.studentRepository.save(data);
	}

}
