package com.interfaces;

public class TestWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxing: storing primitive in wrapper Object
		Integer n = new Integer(100);
		// Integer n = Integer.valueOf(100);
		
		//Unboxing : extract primitive from wrapper object
		int k = n.intValue();
		
		//auto-Unboxing
		// int k = n;
		
		System.out.println(Integer.toHexString(255));
		System.out.println(Integer.toOctalString(255));
		System.out.println(Integer.toBinaryString(255));
	}

}
