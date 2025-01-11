package org.example.Inheritance;

// Inheritance means when we take properties from one class to other is called ......
// not only properties but also the method
// reusability

class shape {
    String color;
}

class Triangle extends shape {

}

public class Inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
