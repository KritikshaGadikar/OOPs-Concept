package org.example.Abstarction;

// Multiple inheritance is only possible with interface in java.

interface Animal2 {
    public void walk();
}

interface Herbivorus {

}

class Horse2 implements Animal2, Herbivorus{           //main line
    public void walk() {
        System.out.println("4");
    }
}

public class Abstraction3 {
    public static void main(String args[]) {
        Horse2 h1 = new Horse2();
        h1.walk();
    }
}