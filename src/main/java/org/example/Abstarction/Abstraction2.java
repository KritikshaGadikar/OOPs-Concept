package org.example.Abstarction;

// this is by pure method (interface)

interface Animal {
    public void walk();       // if we remove the public then also it will take  it as public by default it will be done in interface only
    }

    class Horse1 implements Animal {
        public void walk() {                           // but we cannot remove the public from here error will come
            System.out.println("4");
        }
    }

public class Abstraction2 {
    public static void main(String args[]) {
        Horse1 h1 = new Horse1();
        h1.walk();
    }
}