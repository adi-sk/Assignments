package com.contactList.aditya;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ContactList implements Runnable {

	static List<Contact> contactList = new LinkedList<>();
	BufferedWriter bufferWrite;
	
	public ContactList(String destination) throws IOException{
	  bufferWrite = new BufferedWriter(new FileWriter(destination));
	}
	
	
	
	
	public boolean addContactToList(Contact contact){
		if(contactList.add(contact)){
			System.out.println("Contact added to list");
			return true;
		}
		else{
			System.out.println("Something went wrong while adding file");
			return false;
		}
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			bufferWrite.write("FirstName"+","+"LastName"+","+"Email"+","+"Age"+","+"Phone"+"\n");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(Contact contact: contactList){
			try {
				System.out.println(contact.toString());
				bufferWrite.write(contact.getFirstName()+","+contact.getLastName()+","+contact.getEmail()+","+contact.getAge()+","+contact.getPhone()+"\n");
				System.out.println("inside : " + Thread.currentThread().getName());
				bufferWrite.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
