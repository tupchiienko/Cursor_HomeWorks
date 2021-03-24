package homework2;

public class Counter {

    private static int objectsCount;

    public Counter() {
        objectsCount++;
    }

    public static int getObjectsCount() {
        return objectsCount;
    }
}
