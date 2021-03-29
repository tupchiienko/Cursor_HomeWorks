package homework3.task2.entity;

public class Appliance extends ElectronicsProduct {

    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        super.setGuaranteePeriod(6);
    }

    @Override
    public double getPrice() {
        if (getQuantity() < 50) {
            return super.getPrice() * 1.05;
        }
        return super.getPrice();
    }
}
