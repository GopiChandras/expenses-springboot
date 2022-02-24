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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 @Column(name = "name")
	 private String name;
	 
	 @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	    @JoinTable(name = "student_lib",
        joinColumns = { @JoinColumn(name = "student_id") },
        inverseJoinColumns = { @JoinColumn(name = "lib_id") })
	 List<Lib> lib=new ArrayList<>();
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Lib> getLib() {
		return lib;
	}
	public void setLib(List<Lib> lib) {
		this.lib = lib;
	}
	public Student() {}
	
	public Student(String name, Long id, List<Lib> lib) {
		super();
		this.name = name;
		this.id = id;
		this.lib = lib;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", lib=" + lib + "]";
	}
	 
	 
	 
}
