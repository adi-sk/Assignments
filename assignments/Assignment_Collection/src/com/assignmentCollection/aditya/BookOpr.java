package com.assignmentCollection.aditya;

import java.util.*;

public class BookOpr implements BookBAO {

	
	List<Book> books = new LinkedList<>();
	@Override
	public void add(Book b) {
		// TODO Auto-generated method stub
		books.add(b);
	}

	@Override
	public Book searchByTitle(String title) {
		// TODO Auto-generated method stub
		for(Book b : books){
			if(b.getTitle().compareToIgnoreCase(title) == 0){
				return b;
			}
		}
		
		
		return null;
	}

	@Override
	public List<Book> searchByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Book> bk = new LinkedList<>();
		for(Book b : books){
			if(b.getAuthor().compareToIgnoreCase(author) == 0){
				bk.add(b);
			}
		}
		
		
		return bk;
	}

	@Override
	public List<Book> belowRs(float amt) {
		// TODO Auto-generated method stub
		List<Book> bk = new LinkedList<>();
		for(Book b : books){
			if(b.getPrice()< amt){
				bk.add(b);
			}
		}
		
		
		return bk;
	}

	
}
