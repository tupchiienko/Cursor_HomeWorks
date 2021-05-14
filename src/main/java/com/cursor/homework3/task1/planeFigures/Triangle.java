package com.cursor.homework3.task1.planeFigures;

import com.cursor.homework3.task1.abstractClasses.PlaneShape;
import com.cursor.homework3.task1.vertices.Vertex2D;

import java.util.Arrays;

public class Triangle extends PlaneShape {

    private double ab;
    private double bc;
    private double ac;

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        this.vertices = new Vertex2D[]{a, b, c};
        calculateDistances();
    }

    @Override
    public double getArea() {
        double s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ac));
    }

    @Override
    public double getPerimeter() {
        return ab + bc + ac;
    }

    private void calculateDistances() {
        ab = vertices[0].getDistance(vertices[1]);
        bc = vertices[1].getDistance(vertices[2]);
        ac = vertices[2].getDistance(vertices[0]);
    }

    public String toString() {
        return "Triangle{" +
                "vertices=" + Arrays.toString(vertices) +
                ", ab=" + ab + ", bc=" + bc + ", ac=" + ac +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                "}";
    }
}
