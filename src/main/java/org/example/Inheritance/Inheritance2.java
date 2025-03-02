package org.example.Inheritance;

//multilevel level inheritance

class shape2 {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle2 extends shape2 {
    public  void area(int l, int h) {
        System.out.println("1/2*l*h");
    }
}

class equilateralTriangle extends Triangle2 {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

public class Inheritance2 {
    public static void main(String args[]) {
//        equilateralTriangle e1 = new equilateralTriangle();
//        e1.area();
    }
}
