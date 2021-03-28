package homework3.task2.entity;

import homework3.task2.exceptions.AgeException;
import homework3.task2.exceptions.BalanceException;

public class Customer {

    private final String name;
    private int age;
    private double balance;

    public Customer(String name, int age, double balance) {
        this.name = name;
        this.setAge(age);
        this.setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("Age can`t be less than zero.");
        }
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws BalanceException {
        if (balance < 0) {
            throw new BalanceException("The balance can`t be less than zero.");
        }
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
