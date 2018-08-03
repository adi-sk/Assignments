package com.iotest;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create buffer of size 100
		byte[] buffer = new byte[100];
		
		try{
			System.out.println("Enter Your Name:");
			
			int len = System.in.read(buffer);
			
			System.out.println("You have entered "+len+" bytes");
			
			String name = new String(buffer,0,len);
			System.out.println("name :"+ name);
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
