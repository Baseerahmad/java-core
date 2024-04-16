package com.learning.core.day4session2.D04P10;
import java.util.Scanner;

public class LinearSearch {

    public static boolean linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of arrays
        System.out.print("Enter the number of arrays: ");
        int numArrays = scanner.nextInt();

        // Process each array
        for (int i = 0; i < numArrays; i++) {
            // Input the size of the current array
            System.out.print("Enter the size of array " + (i + 1) + ": ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            // Input the elements of the current array
            System.out.println("Enter the elements of array " + (i + 1) + ":");
            for (int j = 0; j < size; j++) {
                arr[j] = scanner.nextInt();
            }

            // Input the element to search
            System.out.print("Enter the element to search in array " + (i + 1) + ": ");
            int key = scanner.nextInt();

            // Perform linear search
            boolean found = linearSearch(arr, key);

            // Print result
            if (found) {
                System.out.println("Element is Present");
            } else {
                System.out.println("Element is not Present");
            }
        }

        scanner.close();
    }
}
