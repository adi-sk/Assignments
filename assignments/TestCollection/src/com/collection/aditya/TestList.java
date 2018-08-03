package com.collection.aditya;
import java.util.*;


public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> p = new LinkedList<>();
		p.add(new Person("Aditya",23,"adikrhd@gmail.com"));
		p.add(new Person("Adi",24,"adikrhd@gmail.com"));
		p.add(new Person("RAj",19,"adikrhd@gmail.com"));
		
		Collections.sort(p);
	
		
		for(Person ps : p  ){
			System.out.println(ps.getName());
		}
		
		Collections.sort(p, new Comparator<Person>(){

			@Override
			public int compare(Person P1, Person P2) {
				// TODO Auto-generated method stub
				return P1.getName().compareTo(P2.getName());
			}
			
		});
	
		
		for(Person ps : p  ){
			System.out.println(ps.getName());
		}
		
		//Lamda Expression
		Comparator<Person> comparator = (p1,p2)-> p1.getAge()-p2.getAge();
		Comparator<Person> compareEmails = (x,y)-> x.getEmail().compareTo(y.getEmail());
		
		Collections.sort(p,comparator);
		
		
		for(Person ps : p  ){
			System.out.println(ps.getName());
		}
	}

}
