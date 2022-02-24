package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENTS")
public class PamentEntity {
	@Id
	@GeneratedValue
	private int payment;
	private String paymentStatus;
	private String transactionId;
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public PamentEntity(int payment, String paymentStatus, String transactionId) {
		super();
		this.payment = payment;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
	}

}
