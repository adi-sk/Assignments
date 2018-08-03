package com.exception;

public class TestException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int n = 0;
		
			for(String i : args){
				try{
					n = Integer.parseInt(i);
				}
				catch(NumberFormatException e){
					System.out.println(e.getMessage());
					n = 0;
				}
				sum += n;
				
			}
		
		System.out.println(sum);
	}

}
