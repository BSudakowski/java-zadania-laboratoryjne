package pl.edu.agh.qa.carsimulator;

import pl.edu.agh.qa.carsimulator.driver.Driver;

public class Car {
    private Driver driver;
    private String brand;
    private int maxSpeed;
    private int gears;
    private boolean isEngineStarted;
    private int currentSpeed;
    private int currentGear;
    private static final int INCREASE_SPEED_VALUE = 10;

    public Car(String brand, int maxSpeed, int gears) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.gears = gears;
        this.isEngineStarted = false;
        this.currentSpeed = 0;
        this.currentGear = 0;
    }

    public void startEngine() {
        isEngineStarted = true;
    }

    public void speedUp() {
        if (isEngineStarted) {
            if (currentSpeed + INCREASE_SPEED_VALUE < maxSpeed) {
                currentSpeed = currentSpeed + INCREASE_SPEED_VALUE;
            } else {
                currentSpeed = maxSpeed;
            }
            currentGear = getGearForSpeed(currentSpeed);
        } else {
            System.out.println("Start engine first");
        }
    }

    public void slowDown() {
        if (isEngineStarted && currentSpeed > INCREASE_SPEED_VALUE) {
            currentSpeed = currentSpeed - INCREASE_SPEED_VALUE;
            currentGear = getGearForSpeed(currentSpeed);
        } else if (isEngineStarted && currentSpeed <= INCREASE_SPEED_VALUE) {
            currentSpeed = 0;
            currentGear = 0;
            isEngineStarted = false;
            System.out.println("Car stopped");
        } else {
            System.out.println("Car is not driving");
        }
    }

    public String toString() {
        if (isEngineStarted) {
            if (driver != null) {
                return brand + " is driving by " + driver.getFirstName() + " " + driver.getLastName() + " on gear " + currentGear + " with speed " + currentSpeed;
            } else {
                return brand + " is driving on gear " + currentGear + " with speed " + currentSpeed;
            }
        } else {
            if (driver != null) {
                return brand + " is not being driven by the owner " + driver.getFirstName() + " " + driver.getLastName();
            } else {
                return brand + " is not driving";
            }

        }
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    private int getGearForSpeed(int speed) {
        if (speed == maxSpeed) {
            return gears;
        } else {
            int speedValuePerGear = maxSpeed / gears;
            return 1 + speed / speedValuePerGear;
        }
    }

}
