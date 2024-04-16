package com.learning.core.day3session1.D03P07;

import java.util.TreeSet;

public class FindPersonDetails {
	public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();

        // Adding predefined information of 6 persons
        persons.add(new Person(1, "Alice", 20, 1500.0));
        persons.add(new Person(2, "Bob", 30, 2500.0));
        persons.add(new Person(3, "Charlie", 40, 3500.0));
        persons.add(new Person(4, "David", 25, 2000.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));

        // Print all Persons details whose age is greater than 25
        System.out.println("Persons details whose age is greater than 25:");
        for (Person person : persons) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }

}
