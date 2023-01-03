package pl.edu.agh.qa;

import java.util.HashMap;
import java.util.Map;

public class ItemsLocationData {
    public static void main(String[] args) {
        Item galeriaKrakowska = new Item("duza", "Galeria Krakowsja");
        Item stacjaOrlen = new Item("srednia", "PKN Orlen");
        Item lotnisko = new Item("ogromne", "Lotnisko Balice");

        Map<Item, String> itemsLocationMap = new HashMap<>();
        itemsLocationMap.put(galeriaKrakowska, "Krakow, ul. Pawia 5");
        itemsLocationMap.put(stacjaOrlen, "Krakow, ul. Bora Komorwskiego 20");
        itemsLocationMap.put(lotnisko, "Balice, ul. Ltniskowa 1");

        for (Item key : itemsLocationMap.keySet()) {
            System.out.println(itemsLocationMap.get(key) + " - " + key.getName());
        }
    }
}
