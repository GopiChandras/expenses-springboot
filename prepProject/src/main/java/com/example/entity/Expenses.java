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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "table")
public class Expenses {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="payee")
	private String payee;
	
	@Column(name="amount")
	private int amount; 
	
	@Column(name = "created")
	private String created;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	public User user;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "exp_id",referencedColumnName = "id")
	List<ExpensesTypes> expensesTypes = new ArrayList<>();

	public Expenses() {}
	
	public Expenses(Long id, String payee, int amount, String created, User user, List<ExpensesTypes> expensesTypes) {
		super();
		this.id = id;
		this.payee = payee;
		this.amount = amount;
		this.created = created;
		this.user = user;
		this.expensesTypes = expensesTypes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ExpensesTypes> getExpensesTypes() {
		return expensesTypes;
	}

	public void setExpensesTypes(List<ExpensesTypes> expensesTypes) {
		this.expensesTypes = expensesTypes;
	}

	@Override
	public String toString() {
		return "Expenses [id=" + id + ", payee=" + payee + ", amount=" + amount + ", created=" + created + ", user="
				+ user + ", expensesTypes=" + expensesTypes + "]";
	}
	
	

	
	
	
	
}
