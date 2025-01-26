package com.demo.helloworld;

import java.util.Scanner;

public class arithOperators {
	public static void main(String[] args) {
		int a,b,res;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		res = a+b;
		System.out.println("Addition:"+res);
		res = a-b;
		System.out.println("Subtraction:"+res);
		res = a*b;
		System.out.println("Multiplication: "+res);
		res = a/b;
		System.out.println("Division: "+res);
		res = a%b;
		System.out.println("Remainder: "+res);
	}

}
