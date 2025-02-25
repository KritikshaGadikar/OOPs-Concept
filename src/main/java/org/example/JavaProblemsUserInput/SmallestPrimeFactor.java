package org.example.JavaProblemsUserInput;

import java.util.Scanner;

public class SmallestPrimeFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Smallest prime factor of " + number + " is: " + findSmallestPrimeFactor(number));
    }

    public static int findSmallestPrimeFactor(int n) {
        if (n <= 1)
            return n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return i;
        }
        return n;
    }
}
