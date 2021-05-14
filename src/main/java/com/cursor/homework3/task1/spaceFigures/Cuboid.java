package com.cursor.homework3.task1.spaceFigures;

import com.cursor.homework3.task1.abstractClasses.SpaceShape;
import com.cursor.homework3.task1.vertices.Vertex3D;

import java.util.Arrays;

public class Cuboid extends SpaceShape {

    private final double width, height, depth;

    public Cuboid(Vertex3D a, double width, double height, double depth) {
        this.vertices = new Vertex3D[]{a};
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "vertices=" + Arrays.toString(vertices) +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", area=" + this.getArea() +
                ", volume=" + this.getVolume() +
                "}";
    }
}
