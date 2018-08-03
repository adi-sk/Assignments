package com.aditya.assignment;

import java.util.Scanner;

public class CardFactory {
	public long cardno,pan,contact;
	public String holdername;
	public Card issueNewCard(CardType c){
		
		Scanner scan = new Scanner(System.in);
		this.cardno = System.currentTimeMillis();
		System.out.println("Auto generated Card no. :" + cardno);
		System.out.print("Enter name :");
		this.holdername= scan.nextLine().toUpperCase();
		
		System.out.print("Enter PAN no. :");
		this.pan= scan.nextLong();
		
		System.out.print("Enter contact no. :");
		this.contact= scan.nextLong();
		
		if(c.name().equalsIgnoreCase("DEBIT")){
			System.out.print("Enter MaxWithrawal :");
			double withdrawal = scan.nextDouble();
			
			System.out.print("Enter account number :");
			long accountLinked = scan.nextLong();
			
			DebitCard dc = new DebitCard(cardno,contact,pan,holdername,withdrawal,accountLinked);
			
			return dc;		
		}
		else if(c.name().equalsIgnoreCase("CREDIT")){
			System.out.print("Enter interest rate :");
			float ir = scan.nextFloat();
			
			System.out.print("Enter credit limit :");
			double creditLimit = scan.nextDouble();
			
			System.out.print("Enter Point Accumulated :");
			double pa = scan.nextDouble();
			
			
			CreditCard cc = new CreditCard(cardno,contact,pan,holdername,ir,creditLimit,pa);
			
			return cc;		
		}
		return null;
		
	}
}
