package com.logger.aditya;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		
		Logger l1 = new Logger(new FileOutputStream("test.txt"));
		Logger l2 = new Logger(System.out);
		
		
		l1.write("Line 1\n\n");
		l1.write("Line 2\n\n");
		
		l2.write("Line 3\n");
		l2.write("Line 4\n");
		
		Thread t1 = new Thread(l1);
		Thread t2 = new Thread(l2);
		
		t1.start();
		t2.start();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		l1.close();
		l2.close();
		
		
	}

}
