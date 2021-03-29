package homework3.task2.service;

import homework3.task2.entity.AgeRestriction;
import homework3.task2.entity.Customer;
import homework3.task2.entity.FoodProduct;
import homework3.task2.entity.Product;
import homework3.task2.exceptions.*;

import java.time.LocalDate;

public class PurchaseManager {

    private PurchaseManager() {}

    public static void processPurchase(Product product, Customer customer) throws
            AgeException, BalanceException, OutOfExpirationDateException, PriceException, QuantityException {
        System.out.println();
        LocalDate productExpirationDate;
        if (product instanceof FoodProduct) {
            productExpirationDate = ((FoodProduct) product).getExpirationDate();
            if (productExpirationDate.toEpochDay() - LocalDate.now().toEpochDay() < 0)
                throw new OutOfExpirationDateException("The product has expired.");
        }
        if (product.getQuantity() == 0) {
            throw new QuantityException("The product is out of stock");
        } else if (customer.getBalance() < product.getPrice()) {
            throw new BalanceException("The buyer does not have enough money.");
        } else if (customer.getAge() < 12 && product.getAgeRestriction() == AgeRestriction.TEENAGER) {
            throw new AgeException("The buyer does not have permission to purchase this product. " +
                    "The product is intended for teenagers (12+).");
        } else if (customer.getAge() < 21 && product.getAgeRestriction() == AgeRestriction.ADULT) {
            throw new AgeException("The buyer does not have permission to purchase this product. " +
                    "The product is intended for adult (21+).");
        }
        System.out.println(customer);
        System.out.println(product);
        customer.setBalance(customer.getBalance() - product.getPrice());
        product.setQuantity(product.getQuantity() - 1);
        System.out.println("The buyer bought - " + product.getName() + ".");
        System.out.println(customer);
        System.out.println(product);
    }
}
