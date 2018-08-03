package com.ProduceConsume.aditya;

import java.util.Stack;

public class Consumer implements Runnable {

	private Stack<String> strStack ;
	private static final int STACK_LIMIT =  10;
	public Consumer(Stack<String> strs){
		strStack = strs;
	}
	

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String no ;
		
			while(true){
				synchronized(strStack){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				if(strStack.size() == STACK_LIMIT){
					no = strStack.pop();
					System.out.println("POPING FROM FULL STACK : "+ no+"|| this will wake Producer");
					strStack.notify();
				}
				
				
				else if(!strStack.isEmpty()){
					no = strStack.pop();
					System.out.println("poping from stack : " +no);
					strStack.notify();
					
					
					if(strStack.size() == 0){
						System.out.println("STACK IS EMPTY NOW this will sleep the consumer");
						try {
							strStack.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
			
			
		}
	}
	
}
