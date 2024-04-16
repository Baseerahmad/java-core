package com.learning.core.day1session1.D01P03;

import java.util.Scanner;

public class PrintWeekday {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        int weekDay = scanner.nextInt();

        // Check if the input is within the valid range (1 to 7)
        if (weekDay >= 1 && weekDay <= 7) {
            // Use if-else statements to print the corresponding weekday
            if (weekDay == 1) {
                System.out.println("Output: Sunday");
            } else if (weekDay == 2) {
                System.out.println("Output: Monday");
            } else if (weekDay == 3) {
                System.out.println("Output: Tuesday");
            } else if (weekDay == 4) {
                System.out.println("Output: Wednesday");
            } else if (weekDay == 5) {
                System.out.println("Output: Thursday");
            } else if (weekDay == 6) {
                System.out.println("Output: Friday");
            } else {
                System.out.println("Output: Saturday");
            }
        } else {
            System.out.println("Output: Invalid Input");
        }
        
        scanner.close();
    }
}
