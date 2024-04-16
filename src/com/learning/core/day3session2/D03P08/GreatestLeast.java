package com.learning.core.day3session2.D03P08;

import java.util.Map;
import java.util.TreeMap;

class CarPriceAnalyzer {
    public static void retrieveMinMaxPrices(TreeMap<Car, Integer> carMap) {
        if (carMap.isEmpty()) {
            System.out.println("Car map is empty.");
            return;
        }

        Map.Entry<Car, Integer> maxEntry = null;
        Map.Entry<Car, Integer> minEntry = null;

        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
            if (maxEntry == null || entry.getKey().getPrice() > maxEntry.getKey().getPrice()) {
                maxEntry = entry;
            }
            if (minEntry == null || entry.getKey().getPrice() < minEntry.getKey().getPrice()) {
                minEntry = entry;
            }
        }

        System.out.println(maxEntry.getKey());
        System.out.println(minEntry.getKey());
    }
}

public class GreatestLeast {
	public static void main(String[] args) {
        TreeMap<Car, Integer> carMap = new TreeMap<>();
        carMap.put(new Car("Bugatti", 80050.0), 1);
        carMap.put(new Car("Swift", 305000.0), 2);
        carMap.put(new Car("Audi", 600100.0), 3);
        carMap.put(new Car("Benz", 900000.0), 4);

        CarPriceAnalyzer.retrieveMinMaxPrices(carMap);
    }
}