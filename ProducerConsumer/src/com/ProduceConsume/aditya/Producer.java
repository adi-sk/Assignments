package com.ProduceConsume.aditya;

import java.util.Stack;

public class Producer implements Runnable {
	private Stack<String> strStack;
	private static final int STACK_LIMIT = 10;

	public Producer(Stack<String> strs) {
		strStack = strs;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			synchronized (strStack) {
				
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				

				String no = Long.toString(System.nanoTime());//random String
				
				
				if (strStack.size() == 0) {

					strStack.push(no);
					System.out.println("PRODUCER PUSHING TO EMPTY STACK : " + no + "|| this will wake up consumer");
					strStack.notify();
				} else {
					if (strStack.size() < STACK_LIMIT) {
						System.out.println("Producer is pushing to stack: " + no);
						strStack.push(no);
					} else {
						try {
							strStack.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("STACK IS FULL PRODUCER GOING FOR SLEEP");
					}
				}
			}

		}
	}

}
