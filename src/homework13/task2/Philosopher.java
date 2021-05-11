package homework13.task2;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {
    private final String name;
    private final Semaphore semaphore;

    public Philosopher(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(name + " start eating");
            Thread.sleep(500);
            System.out.println(name + " finish eating");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
