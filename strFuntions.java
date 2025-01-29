package com.demo.helloworld;

public class strFuntions {
	public static void main(String[] args) {
		String str1 = "HELLO", str2 = "Hello";
		System.out.println("String: "+str1+"Length: "+str1.length());
		
		if(str1.equals(str2))
			System.out.println(str1+" & "+str2+": are same");
		else
			System.out.println(str1+" & "+str2+": are not same");
		if(str1.equalsIgnoreCase(str2))
			System.out.println(str1+" & "+str2+": are same (ignoring case)");
		else
			System.out.println(str1+" & "+str2+": are not same (ignoring case");
		System.out.println("The character at position 2: "+str1.charAt(2));
		System.out.println("Compare"+str1+" & "+str2+"Distance: "+str1.compareTo(str2));
		//Output: -32 Because difference between ascii code of upper and lowercase is 32.
		
		str1 = "AABBCABBAA";
		str2 = "JAVA String Functions";
		
		System.out.println("The string "+str1+" is start with (AAB): "+str1.startsWith("AAB"));
		System.out.println("The string "+str1+" is start with (ACA): "+str1.endsWith("ACA"));
		
		System.out.println("First Index of (BB) in "+str1+" is: "+str1.indexOf("BB"));
		System.out.println("Last Index of (BB) in "+str1+" is: "+str1.lastIndexOf("BB"));
		
		System.out.println("Replacing ABB to xy: "+str1.replace("ABB", "xy"));
		
		System.out.println("Substring of "+str2+" from 5 to 15: "+str2.substring(5,15));
//		Output:
//		Substring of JAVA String Functions from 5 to 15: String Fun
		
		str1 = "This-is-a-test-string";
		String[] splitArr = str1.split("-"); //converted string into array
		System.out.println("This splited parts are: ");
		for(String sp: splitArr)
			System.out.println(sp);
//Output:
//		This splited parts are: 
//		This
//		is
//		a
//		test
//		string
		str2 = "      lot's of spaces      ";  //only starting and ending spaces are valid. middle spaces not be trimmed
		System.out.println("Before trimming: "+str2); //Before trimming:       lot's of spaces      
		System.out.println("After trimming: "+str2.trim()); //After trimming: lot's of spaces

		
		
		
	}

}
