package homework3.task1.vertices;

public class Vertex3D extends Vertex2D {
    private final double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Vertex3D{" +
                "x=" + getX() +
                "y=" + getY() +
                "z=" + z +
                '}';
    }
}
