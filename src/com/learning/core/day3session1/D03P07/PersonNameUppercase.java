package com.learning.core.day3session1.D03P07;

import java.util.TreeSet;

public class PersonNameUppercase {
	public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();

        // Adding predefined information of 6 persons
        persons.add(new Person(1, "Jerry", 25, 999.0));
        persons.add(new Person(2, "Smith", 35, 2999.0));
        persons.add(new Person(3, "Popeye", 45, 5999.0));
        persons.add(new Person(4, "Jones", 55, 6999.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));

        // Print all names of persons in uppercase
        System.out.println("Names of persons in uppercase:");
        for (Person person : persons) {
            System.out.println(person.getName().toUpperCase());
        }
    }

}
