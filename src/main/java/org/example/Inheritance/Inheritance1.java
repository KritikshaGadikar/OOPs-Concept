package org.example.Inheritance;

//single level inheritance

class shape1 {
   public void area() {
       System.out.println("display area");
   }
}

class Triangle1 extends shape1 {
    public void area(int l, int h) {
        System.out.println("1/2*l*h");
    }
}

public class Inheritance1 {
    public static void main(String args[]) {
    }
}
