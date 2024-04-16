package com.learning.core.day2session1.D02P05;

import java.util.Scanner;

public class Pailindrome {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Displaying the length of the string
        System.out.println("Length of the string: " + input.length());

        // Converting the string to uppercase
        String uppercaseString = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        // Checking whether the string is a palindrome or not
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

}
