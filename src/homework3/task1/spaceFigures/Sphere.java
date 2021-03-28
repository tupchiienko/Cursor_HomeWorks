package homework3.task1.spaceFigures;

import homework3.task1.abstractClasses.SpaceShape;
import homework3.task1.vertices.Vertex3D;

import java.util.Arrays;

public class Sphere extends SpaceShape {

    private final double radius;

    public Sphere(Vertex3D o, double radius) {
        this.vertices = new Vertex3D[]{o};
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    public String toString() {
        return "Sphere{" +
                "vertices=" + Arrays.toString(vertices) +
                ", radius=" + radius +
                ", area=" + this.getArea() +
                ", volume=" + this.getVolume() +
                "}";
    }
}
