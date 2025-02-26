package org.example.ArrayProblemsUserInput;

import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        int number[] = new int[size];

        System.out.println("Enter the element of array: ");
        for (int i = 0; i < size; i++) {
            number[i] = scanner.nextInt();
        }

        boolean isSorted = true;
        for (int i = 1; i < size; i++) {
            if (number[i] < number[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
