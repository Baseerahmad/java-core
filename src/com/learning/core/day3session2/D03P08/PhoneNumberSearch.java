package com.learning.core.day3session2.D03P08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumberSearch {
	public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create a HashMap to store phone book details
        Map<String, String> phoneBook = new HashMap<>();

        // Add predefined information
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        // Prompt user to input a name
        System.out.print("Enter the name to search for: ");
        String nameToSearch = scanner.nextLine();

        // Search for a phone number
        if (phoneBook.containsKey(nameToSearch)) {
            String phoneNumber = phoneBook.get(nameToSearch);
            System.out.println("Phone number for " + nameToSearch + ": " + phoneNumber);
        } else {
            System.out.println("Phone number not found for " + nameToSearch);
        }

        // Close the Scanner
        scanner.close();
    }
}
