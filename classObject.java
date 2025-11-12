// Package name (optional, used to group related classes together)
package com.demo.helloworld;

// Definition of a class named Student
class Student {

    // ----------------------------
    // Member variables / attributes
    // ----------------------------
    String name;   // to store student name
    int id;        // to store student ID number
    String major;  // to store student's major subject

    // ---------------------------------------------
    // Member methods / functions for class Student
    // ---------------------------------------------

    // Method to set the student's name
    // Takes a string as input and assigns it to 'name'
    void setName(String stName) {
        name = stName;
    }

    // Method to set the student's major subject
    // Takes a string as input and assigns it to 'major'
    void setMajor(String subject) {
        major = subject;
    }

    // Method to display all information about the student
    void display() {
        System.out.println("The student name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Major Subject: " + major);
        System.out.println();  // blank line for better readability
    }
}

// ----------------------------------------------------
// Main class to create and use Student class objects
// ----------------------------------------------------
public class classObject {
    public static void main(String[] args) {

        // Declare two reference variables of Student type
        Student s1, s2;

        // Create (instantiate) two Student objects
        s1 = new Student(); // s1 refers to first Student object
        s2 = new Student(); // s2 refers to second Student object

        // -------------------------------
        // Assign values using methods and direct access
        // -------------------------------

        // Set data for first student
        s1.setName("Joy");
        s1.id = 1021;  // directly setting public variable
        s1.setMajor("Computer Science");

        // Set data for second student
        s2.setName("Anirban");
        s2.id = 1251;
        s2.setMajor("Physics");

        // -------------------------------
        // Display student details
        // -------------------------------
        System.out.println("=== Student Information ===\n");
        s1.display();
        s2.display();

        // -------------------------------
        // Optional: show how objects are independent
        // -------------------------------
        // Each object has its own set of variables and data
        System.out.println("Objects s1 and s2 store separate data in memory.");
    }
}
