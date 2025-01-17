package com.learning.core.day3session2.D03P08;

import java.util.Objects;
import java.util.TreeMap;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car other) {
        return this.name.compareTo(other.name);
    }
}

public class CarInfo {
	public static void main(String[] args) {
        TreeMap<Car, Integer> carMap = new TreeMap<>();
        carMap.put(new Car("Bugatti", 80050.0), 1);
        carMap.put(new Car("Swift", 305000.0), 2);
        carMap.put(new Car("Audi", 600100.0), 3);
        carMap.put(new Car("Benz", 900000.0), 4);

        for (Car car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}

