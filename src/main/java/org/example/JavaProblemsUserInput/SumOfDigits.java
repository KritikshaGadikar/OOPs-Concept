package org.example.JavaProblemsUserInput;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the digit: ");
        int num = scanner.nextInt();

        int sum = 0;

        while (num!=0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
