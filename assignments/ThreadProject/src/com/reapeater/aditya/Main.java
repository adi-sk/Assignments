package com.reapeater.aditya;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repeater a = new Repeater("India");
		Repeater b = new Repeater("Australia");
		
		
		
		Thread t1 = new Thread(a);
		Thread t2= new Thread(b);
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.setName("INDIAN");
		t2.setName("Australian");
		
		
		t1.start();
		t2.start();
		
		for(int i = 1; i<= 100; i++){
			System.out.println(Thread.currentThread().getName()+" :: INSIDE MAIN");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("===========END OF MAIN THREAD==================");
		
		
	}

}
