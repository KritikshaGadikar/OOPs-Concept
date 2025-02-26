package org.example.ArrayProblemsUserInput;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        int numbers[] = new int[size];

        // Prompt the user to enter elements of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("The second largest element is " + secondLargest);
        }
    }
}
