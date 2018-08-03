package com.aditya.utility;

public class Account implements Comparable<Account>{
	private long accountNumber ;
	private static long branchCode;
	private String accountHolder;
	private AccountType accountType;
	private long balanace;
	private AccountStatus status;
	
	Account(long accountNumber,long branchCode, String accountHolder, AccountType accountType, long balanace,AccountStatus status) {
		super();
		this.accountNumber = accountNumber;
		this.branchCode = branchCode;
		this.accountHolder = accountHolder;
		this.accountType = accountType;
		this.balanace = balanace;
		this.status = status;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public long getBalanace() {
		return balanace;
	}
	void setBalanace(long balanace) {
		this.balanace = balanace;
	}
	public AccountStatus getStatus() {
		return status;
	}
	void setStatus(AccountStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountType="
				+ accountType + ", balanace=" + balanace + ", status=" + status + "]";
	}
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}


}

enum AccountType{
	SAVINGS,CURRENT;
}

enum AccountStatus{
	ACTIVE,CLOSED
}
