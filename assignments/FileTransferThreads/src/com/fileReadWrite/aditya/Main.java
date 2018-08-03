package com.fileReadWrite.aditya;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileCopy filecopy;
		try {
			filecopy = new FileCopy("demo1.jpg", "demo3.jpg");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			filecopy = null ;
			e.printStackTrace();
		}
		
		Thread t1 = new Thread(filecopy);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
