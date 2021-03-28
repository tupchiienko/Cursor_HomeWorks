package homework3.task1.planeFigures;

import homework3.task1.abstractClasses.PlaneShape;
import homework3.task1.vertices.Vertex2D;

import java.util.Arrays;

public class Rectangle extends PlaneShape {

    private final double width, height;

    public Rectangle(Vertex2D a, double width, double height) {
        this.vertices = new Vertex2D[]{a};
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "vertices=" + Arrays.toString(vertices) +
                ", width=" + width +
                ", height=" + height +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                "}";
    }
}
