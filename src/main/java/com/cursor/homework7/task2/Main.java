package com.cursor.homework7.task2;

import com.cursor.homework7.task1.Continent;
import com.cursor.homework7.task1.Country;
import com.cursor.homework7.task1.Gender;
import com.cursor.homework7.task1.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.cursor.homework7.task1.Country.*;
import static com.cursor.homework7.task1.Gender.FEMALE;
import static com.cursor.homework7.task1.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(List.of(
                new Person("Petro", 25, MALE, UKRAINE),
                new Person("Olena", 19, FEMALE, UKRAINE),
                new Person("Marek", 50, MALE, POLAND),
                new Person("Rasine", 65, FEMALE, POLAND),
                new Person("Cherina", 42, FEMALE, FRANCE),
                new Person("Bridgett", 18, FEMALE, FRANCE),
                new Person("Jaron", 42, MALE, ISRAEL),
                new Person("Namir", 18, MALE, ISRAEL),
                new Person("John", 10, MALE, USA),
                new Person("Jane", 78, FEMALE, USA),
                new Person("Alonzo", 12, MALE, ARGENTINA),
                new Person("Azael", 43, FEMALE, ARGENTINA),
                new Person("Thomas", 12, MALE, AUSTRALIA),
                new Person("Brittney", 43, FEMALE, AUSTRALIA)
        ));
        Map<Continent, Map<Country, Map<Gender, List<Person>>>> groupedPersonMap = personList.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .collect(Collectors.groupingBy(person -> person.getCountry().getContinent(),
                        Collectors.groupingBy(Person::getCountry,
                                Collectors.groupingBy(Person::getGender)))
                );
        groupedPersonMap.forEach((continent, countryListMap) -> {
            System.out.println(continent + ":");
            countryListMap.forEach((country, genderListMap) -> {
                System.out.println("\t" + country + ":");
                genderListMap.forEach((gender, peopleList) -> {
                    System.out.println("\t\t" + gender + ":");
                    peopleList.forEach(person -> System.out.println("\t\t\t" + person + ";"));
                });
            });
        });
    }
}
