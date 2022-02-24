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

import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "exptypes")
public class ExpensesTypes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="title")
	private String title;
	 
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	public Expenses  expenses;
	
	public ExpensesTypes() {}
	

	public ExpensesTypes(Long id, String title, Expenses expenses) {
		super();
		this.id = id;
		this.title = title;
		this.expenses = expenses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Expenses getExpenses() {
		return expenses;
	}

	public void setExpenses(Expenses expenses) {
		this.expenses = expenses;
	}


	@Override
	public String toString() {
		return "ExpensesTypes [id=" + id + ", title=" + title + ", expenses=" + expenses + "]";
	}

   

	
	
	
	
	
}
