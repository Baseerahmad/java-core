package com.learning.core.day1session1.D01P03;

import java.util.Scanner;

public class Students {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        int marks = scanner.nextInt();

        // Calculate percentage
        double percentage = (double) marks / 100 * 100;

        // Check the grade based on the percentage
        String grade;
        if (percentage >= 60) {
            grade = "A Grade";
        } else if (percentage >= 45) {
            grade = "B Grade";
        } else if (percentage >= 35) {
            grade = "C Grade";
        } else {
            grade = "Fail";
        }

        System.out.println("Output: " + grade);
        
        scanner.close();
    }
}

