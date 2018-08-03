package com.exception;

import default_pack.MyException;

public class TestException1 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int answer;
		try{
			answer = c.calDiv(10,0);
		}
		catch(MyException e){
			e.printStackTrace();
			answer = 0;
		} 
		
		System.out.print(answer);

	}

}

class Calculator{
	public int calDiv(int n1, int n2) throws MyException{
		
		if(n2 == 0){
			throw new MyException();
		}
		
		return(n1/n2);
	}
}
