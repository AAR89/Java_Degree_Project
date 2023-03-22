package Degree_Project;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Jim", "Halpert", 35, "Male", "Austin", 1);
        Person p2 = new Person("Pam", "Beesly", 26, "Female", "New York", 2);
        Person p3 = new Person("Michael", "Scott", 45, "Male", "Scranton", 3);
        Person p4 = new Person("Toby", "Flenderson", 18, "Male", "New York", 4);
        Person p5 = new Person("Dwight", "Schrute", 18, "Male", "Scranton", 5);
        Person p6 = new Person("Angela", "Martin", 19, "Female", "San Francisco", 6);
        Person p7 = new Person("Jim", "Halpert", 35, "Male", "Austin", 1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println();

        System.out.println(p1 == p7);
        System.out.println(p1.equals(p7));
        System.out.println();

        Comparator<Person> personComparator = Comparator.comparingInt(Person::getAge);
        Set<Person> persons = new TreeSet<>(personComparator);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        persons.add(p7);

        System.out.println("Persons older than 20 years: ");
        persons.stream()
                .filter(person -> person.getAge() > 20)
                .forEach(System.out::println);


        System.out.println();

        System.out.println("Female persons: ");
        persons.stream()
                .filter(person -> !person.getGender())
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Average age of persons: ");
        Double collect = persons.stream()
                .collect(Collectors.averagingInt(Person::getAge));
        System.out.println(collect);

        System.out.println();

        System.out.println("Persons from the same city: ");
        persons.stream()
                .filter(person -> Objects.equals(person.getCity(), "New York"))
                .forEach(System.out::println);

    }
}
