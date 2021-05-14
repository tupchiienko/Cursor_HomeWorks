package com.cursor.homework2;

public class Car {

    private final int maxSpeed;
    private int currentSpeed;
    private boolean isEngineStarted;
    private boolean isMoving;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        this.isEngineStarted = false;
        this.isMoving = false;
    }

    public void startEngine() {
        System.out.println("\nStarting engine.");

        if (isEngineStarted) {
            System.out.println("Engine already started.");
            return;
        }
        isEngineStarted = true;
    }

    public void stopEngine() {
        System.out.println("\nStopping engine.");

        if (isMoving) {
            System.out.println("It is dangerous to stop the engine in motion!");
            return;
        }
        if (!isEngineStarted) {
            System.out.println("Engine already stopped.");
            return;
        }
        isEngineStarted = false;
    }

    public void increaseSpeed(int kilometersPerHour) {
        System.out.println("\nIncrease speed by " + kilometersPerHour + " km/h.");

        if (currentSpeed + kilometersPerHour > maxSpeed) {
            currentSpeed = maxSpeed;
            System.out.printf("Can`t increase speed by %d km/h: current speed exceeds maximum.\n" +
                    "Current speed is set to maximum speed - %d km/h.\n", kilometersPerHour, maxSpeed);
            if (!isMoving) {
                isMoving = true;
                System.out.println("Car start moving.");

            }
            return;
        }
        if (!isEngineStarted) {
            System.out.println("Can`t increase speed: engine is not started.");
            return;
        }
        if (currentSpeed == maxSpeed) {
            System.out.println("Car already reached maximum speed.");
            return;
        }
        currentSpeed += kilometersPerHour;
        if (currentSpeed > 0 && !isMoving) {
            isMoving = true;
            System.out.println("Car start moving.");
        }
        if (currentSpeed == maxSpeed)
            System.out.println("Car reached maximum speed " + maxSpeed + " km/h.");
    }

    public void decreaseSpeed(int kilometersPerHour) {
        System.out.println("\nDecrease speed by " + kilometersPerHour + " km/h.");

        if (currentSpeed - kilometersPerHour < 0) {
            isMoving = false;
            currentSpeed = 0;
            System.out.printf("Can`t decrease speed by %d km/h: speed below 0 km/h.\n" +
                    "Current speed is set to 0 km/h.\n" +
                    "Car stopped.\n", kilometersPerHour);
            return;
        }
        if (!isMoving) {
            System.out.println("Car already is not moving.");
            return;
        }
        currentSpeed -= kilometersPerHour;
        if (currentSpeed == 0) {
            isMoving = false;
            System.out.println("Car stopped.");
        }
    }

    public void printStatus() {
        System.out.printf("\nIs engine started: %s;\n" +
                        "Is car moving: %s;\n" +
                        "Current speed: %d km/h;\n",
                isEngineStarted, isMoving, currentSpeed);
    }
}
