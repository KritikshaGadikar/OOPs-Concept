package org.example;

//we are leaning :classes and object
class pen {
    String color;
    String type;

    public void write() {
        System.out.println("WRITE");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

public class OOPS {
    public static void main(String args[]) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();   // this is reference obj
        pen2.color = "black";
        pen2.type = "gel";

    //    new pen().write;      // this is anonymous obj we cant reuse them

//      pen1.write();

        pen1.printColor();
        pen2.printType();
    }
}
