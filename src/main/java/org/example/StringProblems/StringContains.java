package org.example.StringProblems;

import java.util.Scanner;

public class StringContains {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String mainString = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String subString = scanner.nextLine();

        if (mainString.contains(subString)) {
            System.out.println("The main string contain the substring");
        } else {
            System.out.println("The main string does not contain the main string");
        }
    }
}
