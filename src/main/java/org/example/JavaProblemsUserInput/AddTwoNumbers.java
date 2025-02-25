package org.example.JavaProblemsUserInput;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = scanner.nextInt();

        System.out.println(("Enter second number: "));
        int num2 = scanner.nextInt();

        int result = num1 + num2;
        System.out.println("Your answer is " + result);
    }
}
