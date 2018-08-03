package com.aditya.assignment;

public class CreditCard extends Card {
	private float interestRate;
	private double creditLimit;
	private double pointAccumulated;
	
	
	public CreditCard(long cardNo, long pan, long contact, String holderName, float interestRate,double creditLimit,double pointAccumulated) {
		super(cardNo, pan, contact, holderName);
		// TODO Auto-generated constructor stub
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(long creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getPointAccumulated() {
		return pointAccumulated;
	}
	public void setPointAccumulated(float pointAccumulated) {
		this.pointAccumulated = pointAccumulated;
	}
	@Override
	public String toString() {
		return "CreditCard [interestRate=" + interestRate + ", creditLimit=" + creditLimit + ", pointAccumulated="
				+ pointAccumulated + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	protected String getType() {
		return "CC";
	}
}
