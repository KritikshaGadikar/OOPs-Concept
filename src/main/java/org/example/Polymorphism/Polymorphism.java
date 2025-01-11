package org.example.Polymorphism;

// Here we are learning polymorphism , and there are two types Function overloading(Compile time) and function riding(run time), when we are doing polymorphism we should always go with compile time one ,and here we have done that only
class Freinds {
    String name;
    int age;


//    down printInfo tells about many forms
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        Freinds f1 = new Freinds();
        f1.name = "Kritiksha";
        f1.age = 25;

//        s1.printInfo(f1.name);
//        f1.printInfo(f1.name, f1.age);
        f1.printInfo(f1.age);
    }
}
