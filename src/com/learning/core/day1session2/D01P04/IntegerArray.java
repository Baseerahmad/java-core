package com.learning.core.day1session2.D01P04;

public class IntegerArray {
	public static void main(String[] args) {
        // Initialize the array
        int[] Al = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

        // Compute the sum of elements from index 0 to 14 and store it at element 15
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += Al[i];
        }
        Al[15] = sum;

        // Compute the average of all numbers and store it at element 16
        double average = (double) sum / 15;
        Al[16] = (int) average; // Convert average to integer for storage

        // Identify the smallest value from the array and store it at element 17
        int min = Al[0];
        for (int i = 1; i < Al.length; i++) {
            if (Al[i] < min) {
                min = Al[i];
            }
        }
        Al[17] = min;

        // Output the result
        for (int i = 0; i < Al.length - 1; i++) {
            System.out.print(Al[i]);
        }
        System.out.print(" " + Al[Al.length - 1]);
    }
}