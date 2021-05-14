package com.cursor.homework7.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.cursor.homework7.task1.Country.*;
import static com.cursor.homework7.task1.Gender.FEMALE;
import static com.cursor.homework7.task1.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(List.of(
                new Person("Ivan", 25, MALE, UKRAINE),
                new Person("Anna", 19, FEMALE, UKRAINE),
                new Person("Oleg", 50, MALE, POLAND),
                new Person("Maria", 65, FEMALE, POLAND),
                new Person("Sophia", 42, FEMALE, FRANCE),
                new Person("Igor", 12, MALE, ARGENTINA)
        ));
        Set<String> filteredStreamSet = personList.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .collect(
                        HashSet::new,
                        (set, person) -> set.add(person.getName() + " - " + (person.getGender() == Gender.MALE ? "m" : "f")),
                        HashSet::addAll
                );
        filteredStreamSet.forEach(System.out::println);
    }
}
