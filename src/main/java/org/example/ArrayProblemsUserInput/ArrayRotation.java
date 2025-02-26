package org.example.ArrayProblemsUserInput;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] number = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            number[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of steps to rotate: ");
        int k = scanner.nextInt();

        rotateArray(number, k);

        System.out.println("Rotated Array:");
        for (int num : number) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArray(int[] number, int k) {
        int n = number.length;
        k = k % n;
        reverse(number, 0, n - 1);
        reverse(number, 0, k - 1);
        reverse(number, k, n - 1);
    }

    public static void reverse(int[] number, int start, int end) {
        while (start < end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
    }
}
