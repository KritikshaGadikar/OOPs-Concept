package org.example.Inheritance;

//Hierarchical inheritance ( means one parent class and other classes from that one parent class)

class shape3 {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle3 extends shape3 {
    public void area(int l, int h) {
        System.out.println("1/2*l*h");
    }
}

class Circle extends shape3 {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance3 {
    public static void main(String args[]) {
    }
}
