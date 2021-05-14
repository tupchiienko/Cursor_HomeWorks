package com.cursor.homework2;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Circle class and method that returns its area.Write a class Circle (circle) " +
                "and a method that will return its area.");
        Circle circle = new Circle(3);
        double area = circle.getArea();
        double radius = circle.getRadius();
        System.out.printf("r = %.1f; S = %.1f\n", radius, area);

        System.out.println("\n2. Write a class that can count the number of created objects of this class.");
        for (int i = 0; i < 4; i++) {
            new Counter();
        }
        int instancesCount = Counter.getObjectsCount();
        System.out.println("Counter objects count: " + instancesCount);

        System.out.println("\n3. Write the class \"car\", which should be able to start, " +
                "turn off the engine, drive and maintain the required speed.");
        Car car = new Car(250);
        car.printStatus();
        car.startEngine();
        car.printStatus();
        car.increaseSpeed(60);
        car.printStatus();
        car.increaseSpeed(30);
        car.printStatus();
        car.decreaseSpeed(30);
        car.printStatus();
        car.stopEngine();
        car.decreaseSpeed(60);
        car.printStatus();
        car.stopEngine();
        car.printStatus();

        System.out.println("\n4. Class Fractional number with sign (Fractions).");
        Fraction fraction1 = new Fraction(1L, (short) 3);
        Fraction fraction2 = new Fraction(1L, (short) 2);
        Fraction fraction3 = new Fraction(1L, (short) 3);
        boolean fractionComparingResult;
        Fraction fractionOperationResult = fraction1.add(fraction2);
        System.out.printf("(%s) + (%s) = (%s)\n", fraction1, fraction2, fractionOperationResult);
        fractionOperationResult = fraction1.subtract(fraction2);
        System.out.printf("(%s) - (%s) = (%s)\n", fraction1, fraction2, fractionOperationResult);
        fractionOperationResult = fraction1.multiply(fraction2);
        System.out.printf("(%s) * (%s) = (%s)\n", fraction1, fraction2, fractionOperationResult);
        fractionOperationResult = fraction1.divide(fraction2);
        System.out.printf("(%s) - (%s) = (%s)\n", fraction1, fraction2, fractionOperationResult);
        fractionComparingResult = fraction1.equals(fraction2);
        System.out.printf("(%s) == (%s): %s\n", fraction1, fraction2, fractionComparingResult);
        fractionComparingResult = fraction1.isHigher(fraction2);
        System.out.printf("(%s) > (%s): %s\n", fraction1, fraction2, fractionComparingResult);
        fractionComparingResult = fraction1.isHigherOrEqual(fraction3);
        System.out.printf("(%s) >= (%s): %s\n", fraction1, fraction3, fractionComparingResult);

        System.out.println("\n5. Money class for working with monetary amounts.");
        Money money1 = new Money(2L, (byte) 40);
        Money money2 = new Money(1L, (byte) 60);
        double doubleNumber = 2.5;
        Money moneyOperationResult = money1.add(money2);
        boolean moneyComparingResult;
        System.out.printf("%s + %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.subtract(money2);
        System.out.printf("%s - %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.divide(money2);
        System.out.printf("%s / %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.multiply(money2);
        System.out.printf("%s * %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.divide(doubleNumber);
        System.out.printf("%s / %s = %s\n", money1, doubleNumber, moneyOperationResult);
        moneyOperationResult = money1.multiply(doubleNumber);
        System.out.printf("%s * %s = %s\n", money1, doubleNumber, moneyOperationResult);
        moneyComparingResult = money1.equals(money2);
        System.out.printf("%s == %s: %s\n", money1, money2, moneyComparingResult);
        moneyComparingResult = money1.isHigher(money2);
        System.out.printf("%s > %s: %s\n", money1, money2, moneyComparingResult);
        moneyComparingResult = money1.isHigherOrEqual(money2);
        System.out.printf("%s >= %s: %s\n", money1, money2, moneyComparingResult);
    }
}
