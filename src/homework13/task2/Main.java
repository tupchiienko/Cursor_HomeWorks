package homework13.task2;

import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        List<Philosopher> philosopherList = List.of(
                new Philosopher("Vladyslav", semaphore),
                new Philosopher("Igor", semaphore),
                new Philosopher("Volodymyr", semaphore),
                new Philosopher("Oleksandr", semaphore),
                new Philosopher("Kateryna", semaphore)
        );
        for (Philosopher philosopher : philosopherList) {
            new Thread(philosopher).start();
        }
    }
}
