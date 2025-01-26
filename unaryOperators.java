package com.demo.helloworld;

public class unaryOperators {
	public static void main(String[] args) {
		int var1,var2;
		var1 = 50;
		
		var2= -var1;
		System.out.println("var1: "+var1 +", var2: "+var2);
		
		var1=50;
		var2 = var1++;
		System.out.println("var1: "+var1+", var2: "+var2);
		
		var1=50;
		var2 = ++var1;
		System.out.println("var1: "+var1+", var2: "+var2);
		
		var1=50;
		var2 = var1--;
		System.out.println("var1: "+var1+", var2: "+var2);
		
		var1 = 50;
		var2 = --var1;
		System.out.println("var1: "+var1+", var2: "+var2);
		
		boolean b1, res;
		b1=true;
		res = !b1;
		System.out.println("b1: "+b1+", res: "+res);
		
	}

}
