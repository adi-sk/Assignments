package com.aditya.assignment;

public class DebitCard extends Card {

	private double maxWithdrawal;
	private long accountLinked;

	public DebitCard(long cardNo, long pan, long contact, String holderName,double maxWithdrawal, long accountLinked) {
		super(cardNo, pan, contact, holderName);
		// TODO Auto-generated constructor stub
		this.maxWithdrawal = maxWithdrawal;
		this.accountLinked = accountLinked;
		
	}

	public double getMaxWithdrawal() {
		return maxWithdrawal;
	}

	public void setMaxWithdrawal(long maxWithdrawal) {
		this.maxWithdrawal = maxWithdrawal;
	}

	public long getAccountLinked() {
		return accountLinked;
	}

	public void setAccountLinked(long accountLinked) {
		this.accountLinked = accountLinked;
	}

	@Override
	public String toString() {
		return "DebitCards [maxWithdrawal=" + maxWithdrawal + ", accountLinked=" + accountLinked + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	protected String getType() {
		return "DC";
	}
	
	
	
}
