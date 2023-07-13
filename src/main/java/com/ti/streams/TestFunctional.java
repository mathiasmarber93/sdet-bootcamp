package com.ti.streams;

import java.util.List;
import java.util.stream.Collectors;

public class TestFunctional {
    public static void main(String[] args) {
        List<Person> people;

        /*List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());*/

    }



    private static List<Person> getSuperPeople(){
        return List.of(
                new Person("Batman", 35, Gender.MALE),
                new Person("Superman", 35, Gender.MALE),
                new Person("Wonderman", 35, Gender.FEMALE),
                new Person("Flash", 35, Gender.MALE),
                new Person("Black Canary", 35, Gender.MALE)
        );
    }
}
