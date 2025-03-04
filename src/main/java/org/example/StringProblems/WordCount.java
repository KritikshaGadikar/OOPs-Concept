package org.example.StringProblems;

import java.util.Scanner;

public class WordCount {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        int wordCount = countWord(str);

        System.out.println("The no of words in string is: " + wordCount);
    }

    private static int countWord(String str) {
        // Split the string by spaces and count the number of non-empty strings
        String[] words = str.trim().split("\\s");
        return words.length;
    }
}
