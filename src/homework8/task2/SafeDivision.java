package homework8.task2;

import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();
        while (true) {
            try {
                result = a / b;
                break;
            } catch (ArithmeticException ignored) {
                System.out.print("Division by zero. Reenter B: ");
                b = scanner.nextInt();
            }
        }
        System.out.println("Division result: " + result);
    }
}
