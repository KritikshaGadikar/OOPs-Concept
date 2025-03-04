package org.example.StringProblems;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        if(isPalindrome(str)){
            System.out.println("The string is palindrome ");
        } else
            System.out.println("The string is not palindrome");
    }

    private static boolean isPalindrome(String str) {
       str = str.replaceAll("\\s", "").toLowerCase();

       String reversed = new StringBuffer(str).reverse().toString();
       return str.equals(reversed);
    }
}
