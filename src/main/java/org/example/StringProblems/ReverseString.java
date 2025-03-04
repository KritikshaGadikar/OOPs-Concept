package org.example.StringProblems;

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        String reversed = reverse(str);

        System.out.println("Reversed string: " + reversed);
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
