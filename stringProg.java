package com.demo.helloworld;

import java.util.Scanner;

public class stringProg {
	public static void main(String[] args) {
		char[] charString = {'S', 't', 'r', 'i', 'n', 'g'};
		
		String str = new String(charString);
		System.out.println("Character to string: "+str);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		str = scanner.next();
		System.out.println("Entered String: "+str);
		
		str = "JAVA String";
		System.out.println("Assigned: "+str);
		
		str = "First"+" "+"Seconnd";
		System.out.println("String Concatination: "+str);
		
	}

}
