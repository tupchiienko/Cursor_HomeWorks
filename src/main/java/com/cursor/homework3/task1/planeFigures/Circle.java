package com.cursor.homework3.task1.planeFigures;

import com.cursor.homework3.task1.abstractClasses.PlaneShape;
import com.cursor.homework3.task1.vertices.Vertex2D;

import java.util.Arrays;

public class Circle extends PlaneShape {

    private final double radius;

    public Circle(Vertex2D o, double radius) {
        this.vertices = new Vertex2D[]{o};
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle{" +
                "vertices=" + Arrays.toString(vertices) +
                ", radius=" + radius +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                "}";
    }
}
