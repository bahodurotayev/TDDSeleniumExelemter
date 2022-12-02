package day07;

import java.util.Arrays;
import java.util.Iterator;

public class CarTest {
    public static void main(String[] args) {
        Cars[] carsArray = {
                new Toyota("Gasoline"),
                new Honda("Gasoline"),
                new Tesla("Electric")
        };
        iteratorLoop(carsArray);
    }
    public static void enhancedLoop(Cars[] carsArray){
        for (Cars eachCar: carsArray) {
            eachCar.setFuelType();
        }
    }
    public static void forLoop(Cars[] carsArray){
        for (int i = 0; i < carsArray.length; i++) {
            carsArray[i].setFuelType();
        }
    }
    public static void iteratorLoop(Cars[] carsArray){
        Iterator<Cars> iterator = Arrays.stream(carsArray).iterator();
        while (iterator.hasNext()){
            Cars next = iterator.next();
            next.setFuelType();
        }
    }
}
