package com.aditya.assignment;

import java.util.Scanner;

public class App {
	
	
	static Scanner scan = new Scanner(System.in);
	static CardFactory cf = new CardFactory();
	static CardStore cs = new CardStore();
	static String q = "n";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardStore cStore = new CardStore();
		cStore.loadCards();
		while(q!="y"){
			menu();
		}
	}
	
	public static void menu(){
		
		String choice = "" ;
		
		System.out.println("\n\n");
		System.out.print("============MENU==================\n");
		
		System.out.println("A : Add new Card");
		System.out.println("B : Find card by no.");
		System.out.println("L : List card by Holder");
		System.out.println("Q : Quit Application");
		System.out.println();
		System.out.println();
		
		System.out.print("Enter Your Choice : ");
		
		Scanner scan = new Scanner(System.in);
		choice = scan.next().toUpperCase();
		
		switch(choice){
			case "A": addCard();
						break;
			case "B": findCard();
						break;
			case "L": listCards();
						break;
			case "Q": quit();
						break;
						
		}
		
		
		
	}
	
	public static void addCard(){		
		Card crd = null;
		String choice = "";
		System.out.print("Enter Card Type(A:Debit / B:Credit):");
		choice = scan.next().toUpperCase();
		switch(choice){
		case "A": crd = cf.issueNewCard(CardType.DEBIT);
						if(crd!=null){
							cs.add(crd);
						}
						
						break;
					
		case "B": crd = cf.issueNewCard(CardType.CREDIT);
					if(crd!=null){
						cs.add(crd);
					}
					break;
					
		default  : System.out.println("Enter valid input");
					addCard();
								
					
		}
		
		if(crd == null){
			System.out.println("Something went wrong while adding new card");
		}
		
	
	}
	
	public static void findCard(){
		long cardNo =0L;
		Card card = null;
		System.out.print("Enter Card no. to search:");
		cardNo = scan.nextLong();
		
		card = cs.getCardByNo(cardNo);
		
		if(card != null){	
/*			if(card instanceof DebitCard){
				System.out.println("Type : Debit Card");
				System.out.println((DebitCard)card);
			}
			else if(card instanceof CreditCard){
				System.out.println("Type : Credit Card");
				System.out.println((CreditCard)card);
			}*/
			
			
			card.getType();
		}
		else{
			System.out.println("Card not found");
		}
		
		
	}
	
	public static void listCards(){
		String name = "";
		Card[] cards = new Card[10];
		System.out.println("Enter Name to get cards");
		name = scan.nextLine();
		cards = cs.byHoldername(name);
		if(cards.length != 0){
			for(Card c: cards){
				if(c instanceof DebitCard){
					System.out.println((DebitCard)c);
				}
				else  if(c instanceof CreditCard){
					System.out.println((CreditCard)c);
				}
			}
		}
		else{
			System.out.println("No card found");
		}
		
		
	}
	
	public static void quit(){
		System.out.println("Do you really want to quit(y/n):");
		String choice = scan.nextLine().toLowerCase();
		System.out.println(choice);
		if(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")){
			q = "y";
			cs.storeCards();
		}
		else if(choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n")){
			menu();
		}
		else{
			System.out.println("Invalid input");
		}
		
		
		
		
		
	}
	
	

}
