package org.example.ArrayProblemsUserInput;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        int start = 0, end = size - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        System.out.println("\nReversed Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
