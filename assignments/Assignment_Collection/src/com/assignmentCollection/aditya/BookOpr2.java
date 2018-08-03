package com.assignmentCollection.aditya;

import java.util.LinkedList;
import java.util.*;
import java.util.stream.Collectors;

public class BookOpr2 implements BookBAO {
	
	
	
	List<Book> books = new LinkedList<>();
	@Override
	public void add(Book b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book searchByTitle(String title) {
		// TODO Auto-generated method stub
		
		
		return books.stream().filter((x)->x.getTitle().equalsIgnoreCase(title)).findFirst().get();
		
		
		
	}
 
	@Override
	public List<Book> searchByAuthor(String author) {
		// TODO Auto-generated method stub
		
		
		return books.stream().filter((x)-> x.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
		
	}

	@Override
	public List<Book> belowRs(float amt) {
		// TODO Auto-generated method stub
		return books.stream().filter((x)-> x.getPrice()<amt).collect(Collectors.toList());
	}
	
	
	
	
}
