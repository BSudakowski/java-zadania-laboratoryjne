package pl.edu.agh.qa.dealers;

public class CarDealer {
    private static int carsSold = 0;
    private int carsSoldLocally = 0;

    public void sellCar() {
        carsSold++;
        carsSoldLocally++;
    }

    public static int getCarsSold() {
        return carsSold;
    }

    public int getCarsSoldLocally() {
        return carsSoldLocally;
    }
}
