package com.learning.core.day1session1.D01P03;

import java.util.Scanner;

public class factorialValue {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate factorial
        long factorial = calculateFactorial(number);

        // Display the factorial value
        System.out.println("Factorial of " + number + " is " + factorial);
        
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        // Base case: Factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * calculateFactorial(n - 1);
    }
}
