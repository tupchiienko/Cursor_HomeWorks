package homework8.task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("Caught ExceptionA");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        try {
            throw new ExceptionB("Caught ExceptionB");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        try {
            throw new NullPointerException("Caught NullPointerException");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        try {
            throw new IOException("Caught IOException");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
