package com.learning.core.day2session1.D02P05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsequences {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        List<String> subsequences = generateSubsequences(str);
        System.out.println("All subsequences of \"" + str + "\": ");
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }

    // Function to generate all subsequences of a string
    public static List<String> generateSubsequences(String str) {
        List<String> subsequences = new ArrayList<>();
        generateSubsequencesHelper(str, 0, "", subsequences);
        return subsequences;
    }

    private static void generateSubsequencesHelper(String str, int index, String current, List<String> subsequences) {
        if (index == str.length()) {
            subsequences.add(current);
            return;
        }

        // Include the character at the current index
        generateSubsequencesHelper(str, index + 1, current + str.charAt(index), subsequences);

        // Exclude the character at the current index
        generateSubsequencesHelper(str, index + 1, current, subsequences);
    }

}
