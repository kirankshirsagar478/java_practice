package com.demo.helloworld;

public class relationalOperator {
	public static void main(String[] args) {
		boolean result;
		result = (10 == 10);
		System.out.println("Result: "+result);	//true
		
		result = (5 < 5);
		System.out.println("Result: "+result);	//false
		
		result = (5 <= 5);
		System.out.println("Result: "+result); 	//true
		
		result = (4 > 2);
		System.out.println("Result: "+result); 	// true
		
		result = (4 >= 3);
		System.out.println("Result "+result); 	//true
		
		result = (2 != 2);
		System.out.println("Result: "+result); 	//false
		
	}
}
