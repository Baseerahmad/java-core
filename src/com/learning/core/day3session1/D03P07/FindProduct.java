package com.learning.core.day3session1.D03P07;

import java.util.HashSet;
import java.util.Scanner;

public class FindProduct {
	
	public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        // Adding predefined information of 4 products
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        // Search for a particular product
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID to search: ");
        String searchProduct = scanner.nextLine().trim();
        boolean found = false;
        for (Product product : products) {
            if (product.getProductId().equals(searchProduct)) {
                found = true;
                break;
            }
        }

        // Output the search result
        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }

}
