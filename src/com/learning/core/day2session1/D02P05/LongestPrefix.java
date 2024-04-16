package com.learning.core.day2session1.D02P05;

import java.util.Scanner;

public class LongestPrefix {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        int length = longestPrefixSuffixLength(s);
        System.out.println("Length of the longest prefix which is also a suffix: " + length);
    }

    public static int longestPrefixSuffixLength(String s) {
        int n = s.length();
        int[] lps = computeLPS(s);
        return lps[n - 1];
    }

    public static int[] computeLPS(String s) {
        int n = s.length();
        int[] lps = new int[n];
        lps[0] = 0; // Base case

        int len = 0; // Length of the previous longest prefix-suffix

        int i = 1;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    // Try to find a shorter prefix that is also a suffix
                    len = lps[len - 1];
                } else {
                    // No match found, move to the next character
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
