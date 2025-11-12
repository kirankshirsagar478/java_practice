package com.demo.helloworld;

//This program demonstrates the use of the 'char' data type in Java
public class dataTypesCharacter {
 public static void main(String[] args) {

     // -------------------------------
     // Declaration of a character variable
     // -------------------------------
     char myChar;  // 'char' is used to store a single 16-bit Unicode character

     // -------------------------------------------
     // 1️. Assign a character directly using single quotes
     // -------------------------------------------
     myChar = 'A';  // Directly assigning character 'A'
     System.out.println("The value of myChar: " + myChar);
     // Output: The value of myChar: A

     // -------------------------------------------
     // 2️. Assign a character using its ASCII value
     // -------------------------------------------
     myChar = 70;   // ASCII value of 'F' is 70
     System.out.println("The value of myChar: " + myChar);
     // Output: The value of myChar: F

     // -------------------------------------------
     // 3️. Assign a character using Unicode hexadecimal value
     // -------------------------------------------
     myChar = '\u0041';  // Unicode for 'A' (range: \u0000 to \uFFFF)
     System.out.println("The value of myChar: " + myChar);
     // Output: The value of myChar: A

     // -------------------------------------------
     // 4️. Example: Using char in arithmetic
     // -------------------------------------------
     char nextChar = (char) (myChar + 1); // Increment character value
     System.out.println("Next character after " + myChar + " is: " + nextChar);
     // Output: Next character after A is: B
 }
}
