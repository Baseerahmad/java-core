package com.learning.core.day3session1.D03P07;

import java.util.HashSet;

public class ProductDetails {
	public static void main(String[] args) {
        // Create HashSet to store product details
        HashSet<Product> productSet = new HashSet<>();

        // Add predefined product details to the HashSet
        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Zen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruti Alto"));

        // List all the product details
        System.out.println("Product details:");
        for (Product product : productSet) {
            System.out.println(product);
        }
    }

}
