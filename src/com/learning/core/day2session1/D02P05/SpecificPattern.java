package com.learning.core.day2session1.D02P05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpecificPattern {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input for dictionary
	        System.out.print("Enter the words in the dictionary separated by spaces: ");
	        String[] dictionary = scanner.nextLine().split(" ");

	        // Taking input for pattern
	        System.out.print("Enter the pattern (use '?' for wildcard): ");
	        String pattern = scanner.nextLine();

	        List<String> matchingWords = findMatchingWords(dictionary, pattern);

	        System.out.println("Words in the dictionary that match the pattern '" + pattern + "':");
	        for (String word : matchingWords) {
	            System.out.print(word + " ");
	        }
	    }

	    public static List<String> findMatchingWords(String[] dictionary, String pattern) {
	        List<String> matchingWords = new ArrayList<>();

	        for (String word : dictionary) {
	            if (isMatch(word, pattern)) {
	                matchingWords.add(word);
	            }
	        }

	        return matchingWords;
	    }

	    public static boolean isMatch(String word, String pattern) {
	        if (word.length() != pattern.length()) {
	            return false;
	        }

	        for (int i = 0; i < word.length(); i++) {
	            char wordChar = word.charAt(i);
	            char patternChar = pattern.charAt(i);

	            if (patternChar != '?' && wordChar != patternChar) {
	                return false;
	            }
	        }

	        return true;
	    }
}
