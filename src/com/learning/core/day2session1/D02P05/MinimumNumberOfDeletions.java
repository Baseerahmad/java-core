package com.learning.core.day2session1.D02P05;

import java.util.Scanner;

public class MinimumNumberOfDeletions {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int minDeletions = minDeletionsToPalindrome(str);
        System.out.println("Minimum number of deletions to make \"" + str + "\" a palindrome: " + minDeletions);
    }

    public static int minDeletionsToPalindrome(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        // Initialize the dp table for length 1 strings
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Build the dp table for lengths greater than 1
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j) && len == 2) {
                    dp[i][j] = 2;
                } else if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        // The length of the longest palindromic subsequence is dp[0][n - 1]
        // Minimum deletions = total length of string - length of longest palindromic subsequence
        return n - dp[0][n - 1];
    }
}