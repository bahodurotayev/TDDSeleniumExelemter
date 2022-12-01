package day07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _01IteratorLoopIntro {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(12.1);
        doubleList.add(1.4);
        doubleList.add(45.2);
        doubleList.add(10.5);
        doubleList.add(5.1);
        doubleList.add(40.8);
        doubleList.add(7.6);

        //Enhanced for loop
        //enhancedForLoop(doubleList);
        //For Loop
        //forLoop(doubleList);
        //Iterator Loop
        iteratorLoop(doubleList);


    }
    public static void enhancedForLoop(List<Double> doubleList){
        for (Double eachList:doubleList) {
            System.out.println(eachList);
        }
    }
    public static void forLoop(List<Double> doubleList) {
        for (int i = 0; i < doubleList.size(); i++) {
            System.out.println(doubleList.get(i));
        }
    }
    public static void iteratorLoop(List<Double> doubleList){
        Iterator<Double> doubleIterator = doubleList.iterator();
        while (doubleIterator.hasNext()){
            Double nextDouble = doubleIterator.next();
            System.out.println(nextDouble);
        }

    }
}
