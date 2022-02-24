package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
  public Student getStudent() {
	  return new Student("Gopi2");
  }
	@GetMapping("/student1")
	public List<Student> getStudent1() {
		List<Student> student1=new ArrayList<>();
		student1.add(new Student("ggg"));
		return  student1;
	}
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student("Ram1"));
		students.add(new Student("Ram2"));
		students.add(new Student("Ram3"));
		return students;
	}
	@GetMapping("/student/{Name}")
	public Student getStudentPathvariable( @PathVariable( "Name") String Name) {
		return new Student(Name);
	}
	@GetMapping("/student/query")
     public Student getQuieryPharams( @RequestParam(name="Name") String Name) {
    	 return new Student(Name);
     }
}
