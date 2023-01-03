package pl.edu.agh.qa;

import pl.edu.agh.qa.dealers.CarDealer;

public class CarDealersSimulation {
    public static void main(String[] args) {
        CarDealer dealerZakopianska = new CarDealer();
        CarDealer dealerZielonki = new CarDealer();
        CarDealer dealer29Listopada = new CarDealer();
        CarDealer dealerJasnogoska = new CarDealer();

        dealerZakopianska.sellCar();
        dealerZakopianska.sellCar();

        dealerZielonki.sellCar();

        dealer29Listopada.sellCar();
        dealer29Listopada.sellCar();
        dealer29Listopada.sellCar();

        System.out.println("Dealer na 29 Listopada sprzedal " + dealer29Listopada.getCarsSoldLocally() +
                " a razem z innymi dealerami " + CarDealer.getCarsSold());
    }
}
