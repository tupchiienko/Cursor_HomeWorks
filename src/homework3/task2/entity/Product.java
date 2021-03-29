package homework3.task2.entity;

import homework3.task2.exceptions.PriceException;
import homework3.task2.exceptions.QuantityException;
import homework3.task2.interfaces.Buyable;

public abstract class Product implements Buyable {
    private String name;
    private double price;
    private int quantity;
    private AgeRestriction ageRestriction;

    protected Product(String name, double price, int quantity, AgeRestriction ageRestriction) {
        this.name = name;
        this.setPrice(price);
        this.setQuantity(quantity);
        this.ageRestriction = ageRestriction;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final void setPrice(double price) throws PriceException {
        if (price < 0) {
            throw new PriceException("Price can`t be less than zero.");
        }
        this.price = price;
    }

    public final int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) throws QuantityException {
        if (quantity < 0) {
            throw new QuantityException("Quantity can`t be less than zero.");
        }
        this.quantity = quantity;
    }

    public final AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public final void setAgeRestriction(AgeRestriction ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", ageRestriction=" + ageRestriction;
    }
}
