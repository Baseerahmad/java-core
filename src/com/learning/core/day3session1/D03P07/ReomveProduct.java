package com.learning.core.day3session1.D03P07;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class ReomveProduct {
	public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        // Adding predefined information of 4 products
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        // Prompting the user to enter the product ID to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID to remove: ");
        String removeProductId = scanner.nextLine().trim();

        // Removing the specified product
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(removeProductId)) {
                iterator.remove();
                break;
            }
        }

        // Listing all remaining product details
        System.out.println("Product Details after removal:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

}
