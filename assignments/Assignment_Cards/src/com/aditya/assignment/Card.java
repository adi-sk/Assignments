package com.aditya.assignment;

import java.io.Serializable;

public abstract class Card implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2241923495648980244L;
	private long cardNo,pan,contact;
	private String holderName;
	public Card(long cardNo, long pan, long contact, String holderName) {
		super();
		this.cardNo = cardNo;
		this.pan = pan;
		this.contact = contact;
		this.holderName = holderName;
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public long getPan() {
		return pan;
	}
	public void setPan(long pan) {
		this.pan = pan;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	@Override
	public String toString() {
		return "Cards [cardNo=" + cardNo + ", pan=" + pan + ", contact=" + contact + ", holderName=" + holderName + "]";
	}
	

	protected abstract String getType();
}
