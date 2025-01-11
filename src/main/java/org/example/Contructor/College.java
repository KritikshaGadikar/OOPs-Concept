package org.example.Contructor;

// Here I am learning constructor (Non-Parametrized constructor)
class Student {
    String name;
    int age;

    public void StudentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

//    Non-Parametrized constructor (no parameter, no return type) or default contructor
    Student() {
        System.out.println("Non parametrized constructor");
    }
}

public class College {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Kritiksha";
        s1.age = 25;

        s1.StudentInfo();
    }
}
