package com.cursor.homework3.task2.exceptions;

public class OutOfExpirationDateException extends RuntimeException {
    public OutOfExpirationDateException(String message) {
        super(message);
    }
}
