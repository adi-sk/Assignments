package com.ProduceConsume.aditya;

import java.util.Stack;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Stack<String> strStack = new Stack<>();
		
		Thread t1 = new Thread(new Producer(strStack));
		Thread t2 = new Thread(new Consumer(strStack));
		
		t1.start();
		t2.start();
		
		

	}

}
