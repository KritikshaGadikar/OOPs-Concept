package org.example.JavaProblemsUserInput;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " Is a Armstrong num");
        } else {
            System.out.println(num + " Is not a Armstrong num");
        }
    }

    private static boolean isArmstrong(int num) {
        int original = num, sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit,digits);
            num /= 10;
        }
        return sum == original;
    }
}
