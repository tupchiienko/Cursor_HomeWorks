package com.cursor.homework15;

import java.util.Objects;

public class Plane {
    private final int id;
    private final String model;
    private final String serialNumber;
    private final int seats;

    public Plane(int id, String model, String serialNumber, int seats) {
        this.id = id;
        this.model = model;
        this.serialNumber = serialNumber;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var plane = (Plane) o;
        return id == plane.id && seats == plane.seats && model.equals(plane.model) && serialNumber.equals(plane.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, serialNumber, seats);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", seats=" + seats +
                '}';
    }
}
