package com.demo.helloworld;

//This program demonstrates the use of the boolean data type in Java
public class dataTypesBoolean {
 public static void main(String[] args) {

     // -------------------------------
     // Declaration of a boolean variable
     // -------------------------------
     boolean myBool;  // Boolean type data can only hold true or false values

     // -------------------------------
     // Assigning true value
     // -------------------------------
     myBool = true; // Set the variable to true
     System.out.println("The value of myBool: " + myBool); 
     // Output: The value of myBool: true

     // -------------------------------
     // Assigning false value
     // -------------------------------
     myBool = false; // Change the value to false
     System.out.println("The value of myBool: " + myBool);
     // Output: The value of myBool: false

     // -------------------------------
     // Example of boolean in a conditional statement
     // -------------------------------
     if (myBool == false) {
         System.out.println("The condition is FALSE, so this line is printed!");
     } else {
         System.out.println("The condition is TRUE!");
     }
 }
}
