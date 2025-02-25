package org.example.JavaProblemsUserInput;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        System.out.print(first);

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.println(", " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }
}
