package org.example.JavaProblemsUserInput;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String ags[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first num: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second  num: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose operator: +, -, *, /");
        char operator = scanner.next().charAt(0);

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The sum is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The difference is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The product is: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The quotient is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please choose +, -, *, or /.");
        }
    }
}
