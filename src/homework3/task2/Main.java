package homework3.task2;

import homework3.task2.entity.*;
import homework3.task2.interfaces.Expirable;
import homework3.task2.service.PurchaseManager;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Problem 2. Shop.");
        try {
            LocalDate currentDate = LocalDate.now();
            Product noteBook = new Computer("Asus X556UQ", 499.99, 254, AgeRestriction.NONE);
            Product whiskey = new FoodProduct("Black label", 49.99, 54, AgeRestriction.ADULT,
                    LocalDate.of(2030, Month.FEBRUARY, 22));
            Product choco = new FoodProduct("Milk chocolate", 1.99, 51, AgeRestriction.NONE,
                    currentDate.plusDays(10));
            Customer customer = new Customer("Andrew", 21, 500.0);
            PurchaseManager.processPurchase(choco, customer);
            PurchaseManager.processPurchase(whiskey, customer);
            List<Product> productList = List.of(
                    noteBook,
                    whiskey,
                    choco,
                    new FoodProduct("Milk", 1.49, 23, AgeRestriction.NONE,
                            LocalDate.of(2021, Month.MARCH, 28)),
                    new FoodProduct("Bread", 0.99, 77, AgeRestriction.NONE,
                            LocalDate.of(2021, Month.MARCH, 31)),
                    new FoodProduct("Vodka", 9.99, 34, AgeRestriction.ADULT,
                            LocalDate.of(2030, Month.JULY, 1)),
                    new FoodProduct("Jin", 15.99, 12, AgeRestriction.ADULT,
                            LocalDate.of(2030, Month.JANUARY, 5)),
                    new Appliance("Radio", 99.99, 5, AgeRestriction.NONE)
            );
            System.out.println("=".repeat(100));
            System.out.println("\nFilter list of products using lambda.");
            System.out.println("\nSource product list:");
            productList.forEach(System.out::println);
            List<Product> expirableList = productList.stream()
                    .filter(p -> p instanceof Expirable)
                    .collect(Collectors.toList());
            System.out.println("\nExpirable product list:");
            expirableList.forEach(System.out::println);
            String soonestDateOfExpirationProduct = expirableList.stream()
                    .sorted(Comparator.comparingLong(p -> ((Expirable) p).getExpirationDate().toEpochDay()))
                    .filter(p -> ((Expirable) p).getExpirationDate().isAfter(LocalDate.now()) ||
                            ((Expirable) p).getExpirationDate().isEqual(LocalDate.now()))
                    .findFirst()
                    .get()
                    .getName();
            System.out.println("\nSoonest expiration day product name: " + soonestDateOfExpirationProduct);
            List<Product> adultAgeRestrictionProductList = productList.stream()
                    .filter(p -> p.getAgeRestriction() == AgeRestriction.ADULT)
                    .sorted(Comparator.comparingDouble(p -> ((Product) p).getPrice()))
                    .collect(Collectors.toList());
            System.out.println("\nAdult age restriction products sorted by price in ascending order:");
            adultAgeRestrictionProductList.forEach(System.out::println);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
