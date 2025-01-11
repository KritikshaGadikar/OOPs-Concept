package org.example.Contructor;

// Here I am learning constructor (copy constructor)     There is no copy constructor in java
class Student2 {
    String name;
    int age;

    public void StudentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //   copy constructor (parameter, no return type)
    Student2(Student2 s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student2() {

    }
}

public class College2 {
    public static void main(String args[]) {
        Student2 s1 = new Student2();
        s1.name = "Kritiksha";
        s1.age = 25;
//                                                 we have not declared properties for s2 right , what we have done we have assign properties of s1 to s2
        Student2 s2 = new Student2(s1);
        s2.StudentInfo();
    }
}