package com.cursor.homework8.task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("Caught ExceptionA");
        } catch (ExceptionA exception) {
            System.out.println(exception.getMessage());
        }
        try {
            throw new ExceptionB("Caught ExceptionB");
        } catch (ExceptionB exception) {
            System.out.println(exception.getMessage());
        }
        try {
            throw new NullPointerException("Caught NullPointerException");
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            throw new IOException("Caught IOException");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
