package com.collection.aditya;
import java.util.*;


public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set = new HashSet<>();
		set.add(new Person("Aditya",50,"adikrhd@gmail.com"));
		set.add(new Person("Adi",52,"adikrhd@gmail.com"));
		
		Iterator<Person> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}
		
		
	}

}
