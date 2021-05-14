package com.cursor.homework7.task3;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Stream.of("John", "Smith", "John", "Doe", "Jane", "Doe")
                .collect(PersonCollector.getInstance());
        personList.forEach(System.out::println);
    }
}
