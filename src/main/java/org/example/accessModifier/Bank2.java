package org.example.accessModifier;

// public is first type of access modifier, so here we can see on line 10 we can access name .(same example for encapsulation)

class Account2 {
    public String name;
    private String password;           //so for private we can not access this in other class so we are creating getter and setters

    // getter and setter
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank2 {
    public static void main(String args[]) {
        Account2 a1 = new Account2();
        a1.name = "sbi";
//        a1.password ="abc";       //because this is private, and we cannot access from the different class
        a1.setPassword("abc");
        System.out.println(a1.getPassword());
    }
}


 // So to access the private one , so we can use getter and setter , these are function in java so above we will do how to create it okay