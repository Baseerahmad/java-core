package com.learning.core.day3session2.D03P08;

import java.util.TreeMap;


class CarManager {
    public static void retrievePricesInReverseOrder(TreeMap<Car, Integer> carMap) {
        // Retrieving prices in reverse order
        for (Car car : carMap.descendingKeySet()) {
            System.out.println(car);
        }
    }
}

public class CarRetrievePrice {
	 public static void main(String[] args) {
	        TreeMap<Car, Integer> carMap = new TreeMap<>();
	        carMap.put(new Car("Bugatti", 80050.0), 1);
	        carMap.put(new Car("Swift", 305000.0), 2);
	        carMap.put(new Car("Audi", 600100.0), 3);
	        carMap.put(new Car("Benz", 900000.0), 4);

	        CarManager.retrievePricesInReverseOrder(carMap);
	    }
	}

