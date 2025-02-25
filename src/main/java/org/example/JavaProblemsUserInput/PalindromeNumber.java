//A number is a Palindrome if it remains the same when its digits are reversed.
package org.example.JavaProblemsUserInput;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(int num) {
       int original = num;
       int reversed = 0;

       while (num > 0) {
           int digit = num % 10;
           reversed = reversed * 10 + digit;
           num /= 10;
       }
       return original == reversed;
    }
}
