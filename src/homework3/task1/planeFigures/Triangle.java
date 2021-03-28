package homework3.task1.planeFigures;

import homework3.task1.abstractClasses.PlaneShape;
import homework3.task1.vertices.Vertex2D;

import java.util.Arrays;

public class Triangle extends PlaneShape {

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        this.vertices = new Vertex2D[]{a, b, c};
    }

    @Override
    public double getArea() {
        double s = this.getPerimeter() / 2;
        double a = this.getABSide();
        double b = this.getBCSide();
        double c = this.getACSide();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        double a = this.getABSide();
        double b = this.getBCSide();
        double c = this.getACSide();
        return a + b + c;
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
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                "}";
    }
}
