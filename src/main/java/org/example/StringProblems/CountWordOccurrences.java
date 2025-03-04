package org.example.StringProblems;

import java.util.Scanner;

public class CountWordOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        String word = scanner.nextLine();

        int count = countWordOccurrences(str, word);

        System.out.println("The word '" + word + "' occurs " + count + " times in the string.");

    }

    public static int countWordOccurrences(String str, String word) {
        String[] words = str.split("\\s+");
        int count = 0;

        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
