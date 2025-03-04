package org.example.StringProblems;

import java.util.Scanner;

public class RemoveWhitespaces {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        String result = str.replaceAll("\\s","");

        System.out.println(result);
    }
}
