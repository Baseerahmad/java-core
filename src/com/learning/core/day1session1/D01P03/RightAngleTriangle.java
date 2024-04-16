package com.learning.core.day1session1.D01P03;

import java.util.Scanner;

public class RightAngleTriangle {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Input: ");
	        int rows = scanner.nextInt();

	        // Loop to iterate over each row
	        for (int i = 1; i <= rows; i++) {
	            // Loop to print numbers for each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	        
	        scanner.close();
	    }
	}

