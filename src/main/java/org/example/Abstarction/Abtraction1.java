package org.example.Abstarction;


// this is not pure method (abstract classes)

abstract class animal {      // here we have the keyword abstract okay , so here now it is just the abstraction , it just exits but not a real thing , (shortly we can create it , we can think it but not use it)
    abstract void walk();    // also we can also make this function abstract as it is not usefull
}

    class Horse extends animal {
        public void walk() {
            System.out.println("have 4 legs");
        }
    }

    class Chicken extends animal {
        public void walk() {
            System.out.println("have 2 legs");
        }
    }

    public class Abtraction1 {
        public static void main(String args[]) {
            Horse h1 = new Horse();
//            Chicken c1 = new Chicken();
            h1.walk();
//            c1.walk();
        }
    }
// this is not pure abstraction here if the function is not abstract so we can call it anywhere right
