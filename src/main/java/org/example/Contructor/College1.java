package org.example.Contructor;

// Here I am learning constructor (Parametrized constructor)
class Student1 {
    String name;
    int age;

    public void StudentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Parametrized constructor (parameter, no return type)
    Student1(String name, int age ) {
        this.name = name;
        this.age = age;
    }
}

public class College1 {
    public static void main(String args[]) {
        Student1 s1 = new Student1("Kritiksha", 25);
//        s1.name = "Kritiksha";                        this will remove because we have declared it up , so we can do like this in this contructor
//        s1.age = 25;

        s1.StudentInfo();
    }
}
