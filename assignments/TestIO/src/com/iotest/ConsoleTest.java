package com.iotest;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console console = System.console();
		console.printf("Enter Your name :");
		String name = console.readLine();
		console.printf("welcome %s",name);
		

	}

}
