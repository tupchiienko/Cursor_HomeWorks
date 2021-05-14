package com.cursor.homework3.task1;

import com.cursor.homework3.task1.abstractClasses.Shape;
import com.cursor.homework3.task1.planeFigures.Circle;
import com.cursor.homework3.task1.planeFigures.Rectangle;
import com.cursor.homework3.task1.planeFigures.Triangle;
import com.cursor.homework3.task1.spaceFigures.Cuboid;
import com.cursor.homework3.task1.spaceFigures.Sphere;
import com.cursor.homework3.task1.spaceFigures.SquarePyramid;
import com.cursor.homework3.task1.vertices.Vertex2D;
import com.cursor.homework3.task1.vertices.Vertex3D;

public class Main {
    public static void main(String[] args) {
        System.out.println("Problem 1. Geometry.\n");
        Shape<?>[] shapes = new Shape[]{
                new Circle(new Vertex2D(3, 7), 5),
                new Rectangle(new Vertex2D(6, 12), 6, 4),
                new Triangle(new Vertex2D(3, 7), new Vertex2D(9, 15), new Vertex2D(1, 2)),
                new Cuboid(new Vertex3D(3, 5, 8), 3, 4, 8),
                new Sphere(new Vertex3D(1, 7, 3), 12),
                new SquarePyramid(new Vertex3D(11, 6, 1), 8, 12)
        };

        for (Shape<?> shape : shapes) {
            System.out.println(shape);
        }
    }
}
