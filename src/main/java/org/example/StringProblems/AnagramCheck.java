//In other words, two strings are considered anagrams if they have the same characters with the same frequency, but the order of the characters is different. For example, “listen” and “silent” are anagrams

package org.example.StringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main (String args[]) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areAanagrams(str1, str2)) {
            System.out.println("Is anagram");
        } else {
            System.out.println("Is not anagram");
        }
    }

    public static boolean areAanagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replace("\\s", "").toLowerCase();
        str2 = str2.replace("\\s","").toLowerCase();

        if(str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}
