package homework7;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final Gender gender;
    private final Country country;

    public Person(String name, int age, Gender gender, Country country) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && gender == person.gender && country == person.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, country);
    }

    @Override
    public String toString() {
        return name + '(' + age + ')';
    }
}
