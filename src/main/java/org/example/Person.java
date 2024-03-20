package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String meslek;
    String cinsiyet;
    int favoriSayi;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String meslek, String cinsiyet, int favoriSayi) {
        this(firstName, lastName, age);
        this.meslek = meslek;
        this.cinsiyet = cinsiyet;
        this.favoriSayi = favoriSayi;
    }

    //

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}