package com.assignmentCollection.aditya;

import java.util.*;

public interface BookBAO {
	void add(Book b);
	Book searchByTitle(String  title);
	List<Book> searchByAuthor(String author);
	List<Book> belowRs(float amt);
	
}
