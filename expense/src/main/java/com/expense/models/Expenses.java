package com.expense.models;


//import java.util.ArrayList;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

//import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="expenses")
public class Expenses{
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 
 @NotNull
 @Lob
 private String text;
 
 public Expenses(long id, String text, Users users) {
	super();
	this.id = id;
	this.text = text;
	this.users = users;
}

public Users getUsers() {
	return users;
}

public void setUsers(Users users) {
	this.users = users;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

@ManyToOne(fetch=FetchType.LAZY,optional = false)
 @JoinColumn(name="usersid",nullable = false)
 @OnDelete(action = OnDeleteAction.CASCADE)
 @JsonIgnore
 
 
// @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
//	@JoinColumn(name = "Expensesid", referencedColumnName = "id")
//	List<ExpenseTypes> expenseTypes = new ArrayList<>();
 private Users users;
}
