package org.example.PracticeHere;

import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the string: ");
      String str = scanner.nextLine();

      System.out.println("Enter the char to remove: ");
      char character = scanner.next().charAt(0);

      String result = wordOcuurance(str,character);

      System.out.println(result);
}

    private static String wordOcuurance(String str, char character) {
        StringBuilder result = new StringBuilder();

        for(char c: str.toCharArray()) {
            if(c != character) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
