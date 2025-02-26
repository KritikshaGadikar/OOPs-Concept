package org.example.ArrayProblemsUserInput;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter the element of array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
