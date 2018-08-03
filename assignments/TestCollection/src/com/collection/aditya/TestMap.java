package com.collection.aditya;

import java.util.*;
import java.util.Map.Entry;
public class TestMap {

	public static void main(String[] args) {
		//Keys are UNIQUE, Only Immutable types must be used for KEY
		//Values allow duplicates, May not be immutable
		
		Map<String, Person> people = new HashMap<>();
		people.put("P1", new Person("Gajendra",64,"gajendra@gmail.com"));
		people.put("P2", new Person("Rajendra",30,"rajendra@gmail.com"));
		people.put("P3", new Person("Dajendra",20,"dajendra@gmail.com"));
		
		System.out.println(people.get("P1").getName());

		Set<String> keys =  people.keySet();
		for(String str : keys) {
			System.out.println(people.get(str).getName());
		}
		
		Set<Entry<String, Person>> entries = people.entrySet(); 
		for(Entry<String,Person> e: entries) {
			System.out.println(e.getKey() +" "+e.getValue().getName());
		}
	}

}
