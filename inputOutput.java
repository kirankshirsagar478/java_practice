package com.demo.helloworld;

import java.util.Scanner;

public class inputOutput {
	public static void main(String[] args) {
		System.out.println("This is output Line");
		int x = 10;
		System.out.println("Value of X = "+x);
		
		System.out.print("First String");
		System.out.println("Second String");
		
		System.out.printf("This is value of x=%d, PI = %f \n", x, 22f/7);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int data = sc.nextInt();
		
		System.out.println("Entered Number: "+data);
		
		sc.close();
	}

}
