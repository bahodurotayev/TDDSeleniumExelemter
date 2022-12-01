package day07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class _02Iterator {
    public static void main(String[] args) {
        List randomList = new ArrayList();
        randomList.add("Bo");
        randomList.add(12);
        randomList.add(false);
        randomList.add(true);
        randomList.add('c');
        randomList.add(12.3);

        _02Iterator iterator = new _02Iterator();
        iterator.iteratorLoop(randomList);
        System.out.println();
        iterator.enhancedLoop(randomList);
    }
    public void forLoop(List randomList){
        for (int i = 0; i < randomList.size(); i++) {
            System.out.println(randomList.get(i));
        }
    }
    public void enhancedLoop(List randomList){
        for (Object eachList: randomList) {
            System.out.println(eachList);
        }
    }
    public void iteratorLoop(List randomList){
        Iterator iterator = randomList.iterator();
        while (iterator.hasNext()){
            //Object next = iterator.next();
            System.out.println(iterator.next());
        }
    }
}
