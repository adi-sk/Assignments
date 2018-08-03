package com.assignment1;

public class NumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number[] numbers = new Number[3] ;
		float sum = 0f;
		float avg;
		
		numbers[0] = new Integer(12);
		numbers[1] = new Float(1.2);
		numbers[2] = new Long(2121212L);
		
		for(Number i : numbers){
			sum = sum + i.floatValue(); 
		}
		
		avg = sum/3.0f;
		
		System.out.println(avg);
	}

}
