package org.example.JavaProblemsUserInput;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  here: ");
        char ch = scanner.next().charAt(0);

        if(Character.isLetter(ch)) {
            char lowerch = Character.toLowerCase(ch);

            if(lowerch == 'a' || lowerch == 'e' || lowerch == 'i' || lowerch == '0' || lowerch == 'u') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is not a vowel");
            }
        }else {
            System.out.println(ch + " is not a character");
        }
    }
}

