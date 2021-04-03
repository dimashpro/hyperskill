package com.hyperskill.learning.arrays;
/* *
Given the number n, not greater than 100, create the matrix of size n×n and fill it using the following rule.
 Numbers 0 should be stored on the primary (main) diagonal.
 The two diagonals, adjacent to the primary one, should contain numbers 1.
 The next two diagonals should contain numbers 2; etc.

Note: the primary diagonal runs from the top left corner to the bottom right corner.
 */

import java.util.Scanner;

public class FilledMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimension of the matrix :");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Math.abs(j - i) + " ");
            }
            System.out.println();
        }
    }
}
