package com.cursor.homework13.task1;

public class Main {
    public static void main(String[] args) {
        Thread chickenThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    System.out.println("Chicken");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        chickenThread.start();
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Egg");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (chickenThread.isAlive()) {
            try {
                chickenThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Chicken was first!");
        } else {
            System.out.println("Egg was first!");
        }
    }
}
