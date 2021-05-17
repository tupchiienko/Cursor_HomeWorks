package com.cursor.homework15;

import java.util.Objects;

public class Pilot {
    private final int id;
    private final String name;
    private final int age;
    private final String planeModel;

    public Pilot(int id, String name, int age, String planeModel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.planeModel = planeModel;
    }

    public String getName() {
        return name;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var pilot = (Pilot) o;
        return id == pilot.id && age == pilot.age && name.equals(pilot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", planeModel=" + planeModel +
                '}';
    }
}
