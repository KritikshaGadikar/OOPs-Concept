package org.example.StringProblems;

import java.util.Scanner;

public class CountCharacterOccurrences {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        System.out.println("Enter the char to count: ");
        char character = scanner.next().charAt(0);

        int count = countOccurrences(str, character);

        System.out.println("The character '" + character + "' occurs " + count + " times in the string.");
    }

    // Function to count occurrences of a character in a string
    private static int countOccurrences(String str, char character) {
       int count = 0;
       for (char c : str.toCharArray()) {
           if (c == character) {
               count++;
           }
       }
       return count;
    }
}
