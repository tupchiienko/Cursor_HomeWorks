package homework3.task1.vertices;

public class Vertex2D {
    private final double x, y;

    public Vertex2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(Vertex2D vertex2D) {
        return Math.sqrt(Math.pow(this.x - vertex2D.getX(), 2) + Math.pow(this.y - vertex2D.getY(), 2));
    }

    @Override
    public String toString() {
        return "Vertex2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
