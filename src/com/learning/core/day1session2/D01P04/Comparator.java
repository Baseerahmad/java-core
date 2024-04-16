package com.learning.core.day1session2.D01P04;

import java.util.Scanner;

public class Comparator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Array containing the elements
        int[] array = {7, 25, 5, 19, 30};

        // Check if both numbers are present in the array
        boolean found1 = false, found2 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                found1 = true;
            }
            if (array[i] == num2) {
                found2 = true;
            }
        }

        // Display result
        if (found1 && found2) {
            System.out.println("Output: Its Bingo");
        } else {
            System.out.println("Output: Not Found");
        }
        
        scanner.close();
    }
}
