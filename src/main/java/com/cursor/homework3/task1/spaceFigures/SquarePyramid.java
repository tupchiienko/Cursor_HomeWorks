package com.cursor.homework3.task1.spaceFigures;

import com.cursor.homework3.task1.abstractClasses.SpaceShape;
import com.cursor.homework3.task1.vertices.Vertex3D;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {

    private final double width, height;

    public SquarePyramid(Vertex3D o, double width, double height) {
        this.vertices = new Vertex3D[]{o};
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2) + 2 * width * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
    }

    @Override
    public double getVolume() {
        return (Math.pow(width, 2) * height) / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "vertices=" + Arrays.toString(vertices) +
                ", width=" + width +
                ", height=" + height +
                ", area=" + this.getArea() +
                ", volume=" + this.getVolume() +
                "}";
    }
}
