package com.learning.core.day1session1.D01P03;

import java.util.Scanner;

public class NameOfMonth {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        int monthNumber = scanner.nextInt();

        // Check if the input is within the valid range (1 to 12)
        if (monthNumber >= 1 && monthNumber <= 12) {
            // Array to store names of months
            String[] months = {"January", "February", "March", "April", "May", "June", 
                               "July", "August", "September", "October", "November", "December"};

            // Subtract 1 from monthNumber to get the index in the array
            String monthName = months[monthNumber - 1];
            System.out.println("Output: " + monthName);
        } else {
            System.out.println("Output: Invalid Input");
        }
        
        scanner.close();
    }
}

