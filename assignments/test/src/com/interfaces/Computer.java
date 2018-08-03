package com.interfaces;

public class Computer {

	public Display primaryDisplay;
	public Storage primaryStorage;
	
	public static void main(String[] args){
		Computer comp = new Computer();
		
		comp.primaryDisplay = new Projector(); 
		comp.primaryStorage = new Storage(){
			@Override
			public void read(){
				System.out.println("Reading");
			}

			@Override
			public void write() {
				System.out.println("Writing");
				
			}
		};
		
		comp.primaryStorage.read();
	}

	
}



