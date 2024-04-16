package com.learning.core.day3session2.D03P08;

import java.util.Scanner;
import java.util.TreeMap;

class CarOperationManager {
	 public static void removeCar(TreeMap<Car, Integer> carMap, String carName) {
	        Car carToRemove = null;
	        for (Car car : carMap.keySet()) {
	            if (car.getName().equalsIgnoreCase(carName)) {
	                carToRemove = car;
	                break;
	            }
	        }
	        if (carToRemove != null) {
	            carMap.remove(carToRemove);
	            System.out.println("Car removed: " + carToRemove);
	        } else {
	            System.out.println("Car not found: " + carName);
	        }
	    }

	    public static void replaceCar(TreeMap<Car, Integer> carMap, String oldCarName, String newCarName, double newCarPrice) {
	        Car carToReplace = null;
	        for (Car car : carMap.keySet()) {
	            if (car.getName().equalsIgnoreCase(oldCarName)) {
	                carToReplace = car;
	                break;
	            }
	        }
	        if (carToReplace != null) {
	            carMap.remove(carToReplace);
	            carToReplace = new Car(newCarName, newCarPrice);
	            carMap.put(carToReplace, carMap.size() + 1);
	            System.out.println("Car replaced: " + carToReplace);
	        } else {
	            System.out.println("Car not found: " + oldCarName);
	        }
	    }
	}

public class ReplaceName {
	public static void main(String[] args) {
        TreeMap<Car, Integer> carMap = new TreeMap<>();
        carMap.put(new Car("Bugatti", 80050.0), 1);
        carMap.put(new Car("Swift", 305000.0), 2);
        carMap.put(new Car("Audi", 600100.0), 3);
        carMap.put(new Car("Reva", 123000.0), 4);

        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the name of the car to replace
        System.out.print("Enter the name of the car to replace: ");
        String oldCarName = scanner.nextLine();

        // Prompt user for the new name and price of the car
        System.out.print("Enter the new name of the car: ");
        String newCarName = scanner.nextLine();
        System.out.print("Enter the new price of the car: ");
        double newCarPrice = scanner.nextDouble();

        // Replace the car
        CarOperationManager.replaceCar(carMap, oldCarName, newCarName, newCarPrice);

        scanner.close();
    }
}