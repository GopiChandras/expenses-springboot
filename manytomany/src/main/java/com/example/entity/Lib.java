package com.example.entity;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lib")
public class Lib {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "book")
	private String book;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "lib")
	List<Student> student = new ArrayList<>();
	

	public Lib() {}
	
	public Lib(Long id, String book, List<Student> student) {
		super();
		this.id = id;
		this.book = book;
		this.student = student;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	@Override
	public String toString() {
		return "Lib [id=" + id + ", book=" + book + ", student=" + student + "]";
	}
  
	
}
