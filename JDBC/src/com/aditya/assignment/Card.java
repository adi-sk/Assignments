package com.aditya.assignment;

import java.sql.Date;

public class Card {
	
	private int id;
	private Date expDate;
	private int customer_id;
	private int balance;
	private int credit_limit;
	public Card(int id, Date date, int customer_id, int balance, int credit_limit) {
		super();
		this.id = id;
		this.expDate = date;
		this.customer_id = customer_id;
		this.balance = balance;
		this.credit_limit = credit_limit;
	}
	public Card(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date date) {
		this.expDate = date;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(int credit_limit) {
		this.credit_limit = credit_limit;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", expDate=" + expDate + ", customer_id=" + customer_id + ", balance=" + balance
				+ ", credit_limit=" + credit_limit + "]";
	}
	
	
	

}
