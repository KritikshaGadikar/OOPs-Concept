package org.example.StringProblems;

import java.util.Scanner;

public class RemoveCharacterOccurrences {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        System.out.println("Enter the char to remove: ");
        char character = scanner.next().charAt(0);

        String result = removeOccurance(str,character);

        System.out.println("The string after removing '" + character + "': " + result);
        }

    private static String removeOccurance(String str, char character) {
       StringBuilder result = new StringBuilder();

       for (char c: str.toCharArray()) {
           if (c != character) {
               result.append(c);
           }
    }
       return result.toString();
    }
}
