package com.learning.core.day1session2.D01P04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationsOfNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array (space-separated integers): ");
        String[] inputArray = scanner.nextLine().split(" ");
        int k = scanner.nextInt();

        List<List<Integer>> combinations = findCombinations(inputArray, k);

        // Output the result
        System.out.println("Output:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
        
        scanner.close();
    }

    public static List<List<Integer>> findCombinations(String[] inputArray, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        generateCombinations(inputArray, k, 0, currentCombination, combinations);
        return combinations;
    }

    private static void generateCombinations(String[] inputArray, int k, int start, List<Integer> currentCombination, List<List<Integer>> combinations) {
        if (currentCombination.size() == k) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i < inputArray.length; i++) {
            currentCombination.add(Integer.parseInt(inputArray[i]));
            generateCombinations(inputArray, k, i + 1, currentCombination, combinations);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
