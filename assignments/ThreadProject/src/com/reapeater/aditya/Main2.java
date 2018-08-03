package com.reapeater.aditya;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		Repeater r1 = new Repeater("Hello India");
		Repeater r2 = new Repeater("Hello Mumbai");
		Repeater r3 = new Repeater("hello Seepz");
		
		
		service.submit(r1);
		service.submit(r2);
		service.submit(r3);
	
		service.shutdown();
	}

}
