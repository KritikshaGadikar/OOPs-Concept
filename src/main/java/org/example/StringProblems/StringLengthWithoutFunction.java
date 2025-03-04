package org.example.StringProblems;

import java.util.Scanner;

public class StringLengthWithoutFunction {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        // Find the length of the string manually
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        System.out.println("String length " + length);
    }
}
