package com.aditya.assignment;

import java.io.*;

public class CardStore {
	
	private static final String FILE_PATH = "test.dat";
	private static Card[] cards = new Card[100];
	public static int i = 0;
	
	
	// first function which is called from main
	public static void loadCards(){
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_PATH))){
			
			
			Object obj = in.readObject();
			while(obj != null){
				cards[i++] = (Card)obj;
				obj = in.readObject();
			}
			
			
		}catch(EOFException e){
			
		}
		catch(IOException | ClassNotFoundException ex){
			ex.printStackTrace();
		}
	}
	
	// must be called when application terminates
	public static void storeCards(){
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_PATH,false))){
			for(Card c: cards){
				if(c!=null){
					out.writeObject(c);
					
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void add(Card c){
		this.cards[i++] = c;
		System.out.println("Card Added\n\n");
	}
	
	public Card getCardByNo(long no){
		for(Card c : cards){
			if(c!= null){
				if(c.getCardNo() == no){
					return c;
				}
			}
		}
		return null;
	}
	
	public Card[] byHoldername(String name){
		
		Card[] car = new Card[10];
		int l = 0;
		for(Card c : cards){
			if(c!= null){
				if(c.getHolderName().equalsIgnoreCase(name)){
					car[i++] = c; 
				}
			}
		}
		return car;	
	}
	
	
	
}
