package org.example.staticClass;

// Demonstrating the use of static variables
class Student {
    String name; // Instance variable
    static String school = "TVM"; // Static variable shared by all instances
}

public class Fruit {
    public static void main(String[] args) {
        // Creating two student objects
        Student s1 = new Student();

        // Assigning names to the student objects
        s1.name = "Kittu";

        // Accessing static and instance variables
        System.out.println("Student 1: Name = " + s1.name + ", School = " + Student.school);
    }
}
