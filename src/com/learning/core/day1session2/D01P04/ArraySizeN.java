package com.learning.core.day1session2.D01P04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraySizeN {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Map to store element -> index mapping
        Map<Integer, Integer> map = new HashMap<>();

        int firstRepeatingIndex = -1;

        // Iterate through the array
        for (int i = 0; i < N; i++) {
            int num = arr[i];
            // If the number is already present in the map, update firstRepeatingIndex
            if (map.containsKey(num)) {
                firstRepeatingIndex = map.get(num);
                break;
            } else {
                // Otherwise, add the number to the map with its index
                map.put(num, i);
            }
        }

        // Output the result
        if (firstRepeatingIndex != -1) {
            System.out.println("Output: " + firstRepeatingIndex);
        } else {
            System.out.println("Output: No repeating elements found.");
        }
        
        scanner.close();
    }
}

