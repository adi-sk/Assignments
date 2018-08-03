package com.logger.aditya;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Stack;

public class Logger implements Runnable {

	private OutputStream out;
	private boolean doStop = false;

	private Stack<String> stack = new Stack<>();
	
	
	
	public Logger(OutputStream out) {
		super();
		this.out = out;
	}
	
	
	
	/**
	 * this method will write msg to Stack which will later written to output stream
	 */
	public void write(String msg){
		stack.push(msg);
	}
	
	/**
	 * this method turn off the thread
	 */
	public void close(){
		doStop = true;
	}
	
	/**
	 * this method takes value from stack and write it to output stream
	 */	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!doStop){
			if(!stack.isEmpty()){
				try {
					out.write(stack.pop().getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else{
				System.out.println("Stack is empty");
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
