package pl.edu.agh.qa.carsimulator;

import pl.edu.agh.qa.carsimulator.driver.Driver;

public class CarSimulator {
    public static void main(String[] args) {
        Car ford = new Car("Ford", 160, 5);
        Driver jan = new Driver("Jan", "Kowalski", 21);
        ford.setDriver(jan);
        System.out.println(ford);
        ford.startEngine();
        ford.speedUp();
        ford.speedUp();
        ford.speedUp();
        System.out.println(ford);
        ford.slowDown();
        System.out.println(ford);
    }
}
