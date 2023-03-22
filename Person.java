package Degree_Project;

import java.util.Objects;

public class Person {
//Создать класс Person.
//У класса должны быть поля:
//1. Имя (String)
//2. Фамилия (String)
//3. Возраст (продумать тип)
//4. Пол
//5*. Придумать свои собственные поля
//Для этого класса
//1. Реализовать методы toString, equals и hashCode.
//2*. Придумать собственные методы и реализовать их.
//    В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.


    public String firstName;
    public String lastName;
    public int age;
    public String gender;
    public String city;
    public int id;


    public Person(String firstName, String lastName, Integer age, String gender, String city, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, gender, city, id);
    }

    @Override
    public String toString() {
        return
                firstName +
                        " " + lastName +
                        ", age: " + age +
                        ", gender: " + gender +
                        ", city: " + city +
                        ", id: " + id;
    }

    public int getAge() {
        return age;
    }

    public Boolean getGender() {
        return Objects.equals(gender, "Male");
    }

    public String getCity() {
        return city;
    }
}

