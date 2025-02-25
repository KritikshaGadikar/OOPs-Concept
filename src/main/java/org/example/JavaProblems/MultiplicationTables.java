package org.example.JavaProblems;

public class MultiplicationTables {
    public static void main(String args[]) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            System.out.println("Table of " + i);
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i + j));
            }
            System.out.println();  // blank lne between the table
            }
        }
    }
