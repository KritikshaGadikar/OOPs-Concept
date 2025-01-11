package org.example.accessModifier;

// public is first type of access modifier, so here we can see on line 10 we can access name .

class Account {
    public String name;
}
public class Bank {
    public static void main(String args[]) {
        Account a1 = new Account();
                a1.name = "sbi";
    }
}

//  Default is second type od access modifer here when we not decared any think like public or any , so it cosider it as default but it will work for that perticular package only

//class Account {
//     String name;
//}
