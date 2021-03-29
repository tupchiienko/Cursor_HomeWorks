package homework3.task1.planeFigures;

import homework3.task1.abstractClasses.PlaneShape;
import homework3.task1.vertices.Vertex2D;

import java.util.Arrays;

public class Triangle extends PlaneShape {

    private final double ab, bc, ac;

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        this.vertices = new Vertex2D[]{a, b, c};
        this.ab = getABSide();
        this.bc = getBCSide();
        this.ac = getACSide();
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

    private double getABSide() {
        return vertices[0].getDistance(vertices[1]);
    }

    private double getBCSide() {
        return vertices[1].getDistance(vertices[2]);
    }

    private double getACSide() {
        return vertices[2].getDistance(vertices[0]);
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
