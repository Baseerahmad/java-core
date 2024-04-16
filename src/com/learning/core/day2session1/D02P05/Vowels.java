package com.learning.core.day2session1.D02P05;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Taking input string
			System.out.print("Enter a string: ");
			String input = scanner.nextLine();

			// Taking input for the number of vowels to count from the end
			System.out.print("Enter the number of vowels to count from the end: ");
			int n = scanner.nextInt();

			// Converting the input string to lowercase for case-insensitive comparison
			input = input.toLowerCase();

			// Counting the vowels from the end of the string
			int vowelCount = 0;
			StringBuilder lastNVowels = new StringBuilder();
			for (int i = input.length() - 1; i >= 0; i--) {
			    char ch = input.charAt(i);
			    if (isVowel(ch)) {
			        vowelCount++;
			        lastNVowels.insert(0, ch); // Insert at the beginning to maintain the order
			    }
			    if (vowelCount == n) {
			        break;
			    }
			}

			// Checking if the number of vowels found is less than 'n'
			if (vowelCount < n) {
			    System.out.println("Mismatch in Vowel Count");
			} else {
			    System.out.println("Last " + n + " vowels from the end of the string: " + lastNVowels);
			}
		}
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

