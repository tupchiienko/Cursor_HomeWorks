package homework3.task2.entity;

public abstract class ElectronicsProduct extends Product {

    private int guaranteePeriod;

    protected ElectronicsProduct(String name,
                                 double price,
                                 int quantity,
                                 AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    protected final void setGuaranteePeriod(int months) {
        this.guaranteePeriod = months;
    }

    public final int getGuaranteePeriod() {
        return guaranteePeriod;
    }
}
