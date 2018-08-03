package com.reapeater.aditya;

public class Repeater implements Runnable {

	private String message;
	public Repeater(String msg){
		message = msg;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i<=100 ; i++){
			System.out.println( Thread.currentThread().getName()+" : "+message);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
