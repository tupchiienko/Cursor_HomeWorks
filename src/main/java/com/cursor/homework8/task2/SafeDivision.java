package com.cursor.homework8.task2;

import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;
        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();
        while (true) {
            try {
                if (b == 0) {
                    throw new ArithmeticException("Division by zero.");
                }
                result = (double) a / b;
                break;
            } catch (ArithmeticException exception) {
                System.out.print(exception.getMessage() + " Reenter B: ");
                b = scanner.nextInt();
            }
        }
        System.out.println("Division result: " + result);
    }
}
