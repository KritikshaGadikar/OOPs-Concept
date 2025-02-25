// The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.  this: 0, 1, 1, 2, 3, 5, 8

package org.example.JavaProblems;

public class FibonacciSeries {
    public static void main(String args[]) {
        int n = 10;
        int first = 0, second = 1;

        System.out.println("n");

        System.out.println(first + " " + second);

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.println(", " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }
}
