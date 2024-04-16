package com.learning.core.day3session1.D03P07;

import java.util.TreeSet;

public class SumOfSalaries {
	public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();

        // Adding predefined information of 6 persons
        persons.add(new Person(1, "Jerry", 25, 999.0));
        persons.add(new Person(2, "Smith", 35, 2999.0));
        persons.add(new Person(3, "Popeye", 45, 5999.0));
        persons.add(new Person(4, "Jones", 55, 6999.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));

        // Calculate the sum of all salaries
        double sum = 0;
        for (Person person : persons) {
            sum += person.getSalary();
        }

        // Print the sum of all salaries
        System.out.println("Sum of all salaries: " + sum);
    }

}
