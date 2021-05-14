package com.cursor.homework3.task2.entity;

public class Computer extends ElectronicsProduct {

    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        super.setGuaranteePeriod(24);
    }

    @Override
    public double getPrice() {
        if (getQuantity() > 1000) {
            return super.getPrice() * 0.95;
        }
        return super.getPrice();
    }
}
