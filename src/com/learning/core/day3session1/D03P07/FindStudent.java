package com.learning.core.day3session1.D03P07;

import java.util.ArrayList;
import java.util.Scanner;

public class FindStudent {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input student names (space-separated): ");
        String[] names = scanner.nextLine().split(" ");

        // Create ArrayList to store student names
        ArrayList<String> studentList = new ArrayList<>();

        // Add names to the ArrayList
        for (String name : names) {
            studentList.add(name);
        }

        System.out.print("Enter the name to search: ");
        String searchName = scanner.next();

        // Check if the name exists in the list
        boolean found = false;
        for (String name : studentList) {
            if (name.equals(searchName)) {
                found = true;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println("Output: Found");
        } else {
            System.out.println("Output: Not Found");
        }

        scanner.close();
    }

}
