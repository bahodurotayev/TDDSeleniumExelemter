package day07;

import java.util.ArrayList;
import java.util.List;

public class CarTestArrayList {
    public static void main(String[] args) {

        List<Cars> carsList = new ArrayList<>();
        carsList.add(new Toyota("Gasoline"));
        carsList.add(new Honda("Gasoline"));
        carsList.add(new Tesla("Electric"));

        System.out.println("Enhanced Loop");

        for (Cars eachCar: carsList) {
            eachCar.setFuelType();
        }
    }
}
