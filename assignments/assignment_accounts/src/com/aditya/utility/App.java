package com.aditya.utility;

import java.util.*;

import java.util.stream.Collectors;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BranchSet branch = new BranchSet();
		System.out.println("account will be added under BranchCode: "+branch.branchCode);
		branch.openNewAccount(AccountType.CURRENT, 100000l,"Aditya Kurhade");
		branch.openNewAccount(AccountType.SAVINGS, 1234000l, "adi K");
		branch.openNewAccount(AccountType.CURRENT, 1340000l, "kurhade aditya");
		branch.openNewAccount(AccountType.CURRENT, 1553000l, "Rahul");
		branch.openNewAccount(AccountType.CURRENT, 1230000l, "Ramesh");
		branch.openNewAccount(AccountType.SAVINGS, 1540000l, "Suyog");
		branch.openNewAccount(AccountType.CURRENT, 1343000l, "Omkar");
		branch.openNewAccount(AccountType.CURRENT, 2230000l, "Amar");
		branch.openNewAccount(AccountType.SAVINGS, 1130000l, "Akshay");
		branch.openNewAccount(AccountType.CURRENT, 4530000l, "Jayesh");
		branch.openNewAccount(AccountType.CURRENT, 2230000l, "Ram");
		branch.openNewAccount(AccountType.SAVINGS, 2330000l, "Soham");
		branch.openNewAccount(AccountType.CURRENT, 130000l, "Rushikesh");
		branch.openNewAccount(AccountType.SAVINGS, 430000l, "Prasad");
		
		
//		for(Account a : accounts){
//			System.out.println(a);
//		}
//		for(Account a : accounts){
//			System.out.println(a);
//		}
//-------------------//Comparator------------------//////////////////
		Comparator<Account> bal = new Comparator<Account>() {
			
			@Override
			public int compare(Account a1, Account a2) {
				// TODO Auto-generated method stub
				return (int)(a1.getBalanace() - a2.getBalanace());
			}
		};
		Comparator<Account> accN = new Comparator<Account>() {
			
			@Override
			public int compare(Account a1, Account a2) {
				// TODO Auto-generated method stub
				return (int)(a1.getAccountNumber() - a2.getAccountNumber());
			}
		};
		
//============================================================================================================		
		
		
	
		
		
//		accounts.sort(accN);
//		for(Account a : accounts){
//			System.out.println(a);
//		}
//		
		
		Transaction transaction = new Transaction(branch);	
		
		transaction.deposit(1l, 1000000l);
		transaction.withdraw(2l, 100000l);
		transaction.transfer(3l, 4l, 300000l);
		
		branch.closeAccount(1);
		
		
		List<Account> Active = branch.getAll().stream().filter((x)->x.getStatus().equals(AccountStatus.ACTIVE)).collect(Collectors.toList());
		List<Account> close = branch.getAll().stream().filter((x)->x.getStatus().equals(AccountStatus.CLOSED)).collect(Collectors.toList());
		
		List<Account> accGreat = new LinkedList<>(); 
		
		for(Account acc : branch.getAll()){
			if(acc!=null){
			
				if(acc.getStatus().equals(AccountStatus.CLOSED) && acc.getBalanace()>5000){
					accGreat.add(acc);
				}
			}
		}
		
		
		for(Account a : accGreat){
			System.out.println(a);
		}
		
		
		
		
	}

}
