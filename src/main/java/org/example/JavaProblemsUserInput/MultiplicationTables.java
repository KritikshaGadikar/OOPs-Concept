package org.example.JavaProblemsUserInput;

import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");

        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Table of " + i);
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i + j));
            }
            System.out.println();  // blank line between the table
        }
    }
}
