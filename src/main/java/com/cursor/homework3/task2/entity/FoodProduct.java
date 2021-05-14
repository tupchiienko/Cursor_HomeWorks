package com.cursor.homework3.task2.entity;

import com.cursor.homework3.task2.interfaces.Expirable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FoodProduct extends Product implements Expirable {

    private final LocalDate expirationDate;

    public FoodProduct(String name,
                       double price,
                       int quantity,
                       AgeRestriction ageRestriction,
                       LocalDate expirationDate) {
        super(name, price, quantity, ageRestriction);
        this.expirationDate = expirationDate;
    }

    @Override
    public double getPrice() {
        LocalDate currentDate = LocalDate.now();
        if (expirationDate.toEpochDay() - currentDate.toEpochDay() <= 15) {
            return super.getPrice() * 0.7;
        }
        return super.getPrice();
    }

    @Override
    public final LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", expirationDate=" +
                getExpirationDate().format(DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH)) +
                '}';
    }

}
