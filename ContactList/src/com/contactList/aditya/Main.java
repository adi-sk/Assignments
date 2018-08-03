package com.contactList.aditya;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ContactList func1,func2,func3;
		
		try {
			func1 = new ContactList("file1.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			func1 = null;
		}
		
		func1.addContactToList(new Contact("Aditya", "Kurhade", "adikrhd@gmail.com", 22, 9664240554l));
		func1.addContactToList(new Contact("Suyog", "Gadhave", "suyoggadhave@gmail.com", 22, 96642405542l));
		func1.addContactToList(new Contact("Akshay", "Phate", "akshayphate@gmail.com", 22, 9664240554l));
		func1.addContactToList(new Contact("Risabh", "Gupta", "rk@gmail.com", 22, 9664240553l));
		func1.addContactToList(new Contact("Aditya", "Kurhade", "adikrhd@gmail.com", 22, 9664240554l));
		func1.addContactToList(new Contact("Aditya", "Kurhade", "adikrhd@gmail.com", 22, 9664240554l));
		func1.addContactToList(new Contact("Aditya", "Kurhade", "adikrhd@gmail.com", 22, 9664240554l));
		func1.addContactToList(new Contact("Aditya", "Kurhade", "adikrhd@gmail.com", 22, 9664240554l));
		func1.addContactToList(new Contact("Aditya", "Kurhade", "adikrhd@gmail.com", 22, 9664240554l));
		func1.addContactToList(new Contact("Aditya", "Kurhade", "adikrhd@gmail.com", 22, 9664240554l));
		
		try {
			func2 = new ContactList("file2.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			func2 = null;
			
		}
		
		try {
			func3 = new ContactList("file3.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			func3 = null;
		}
		
		
		Thread t1 = new Thread(func1);
		Thread t2 = new Thread(func2);
		Thread t3 = new Thread(func3);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		
		
		
		
	}

}
