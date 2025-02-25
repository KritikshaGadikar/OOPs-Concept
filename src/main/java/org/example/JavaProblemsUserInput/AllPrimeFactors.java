//Generate all prime factors of a number.

package org.example.JavaProblemsUserInput;

import java.util.Scanner;

public class AllPrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Prime factors of " + number + " are:");
        findPrimeFactors(number);
    }

    public static void findPrimeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}
