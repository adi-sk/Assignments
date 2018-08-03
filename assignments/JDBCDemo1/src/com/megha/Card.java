package com.megha;

import java.io.Serializable;
import java.util.Date;

public class Card implements Serializable {
	private int id;
	private java.sql.Date expiry;
	private int customer_id;
	private float balance;
	private float credit_limit;
	
	
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(java.sql.Date expiry) {
		this.expiry = expiry;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public float getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(float credit_limit) {
		this.credit_limit = credit_limit;
	}
	public Card(int id, java.sql.Date expiry, int customer_id, float balance, float credit_limit) {

		this.id = id;
		this.expiry = (java.sql.Date) expiry;
		this.customer_id = customer_id;
		this.balance = balance;
		this.credit_limit = credit_limit;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", expiry=" + expiry + ", customer_id=" + customer_id + ", balance=" + balance
				+ ", credit_limit=" + credit_limit + "]";
	}
	
	
	

}
