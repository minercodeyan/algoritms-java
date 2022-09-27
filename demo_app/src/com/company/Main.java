package com.company;
import java.util.Iterator;

/*ЗАДАНИЕ 1.3.34 СТР 161*/

public class Main {

    public static void main(String[] args) {
        RandomBag<Integer> randomBag = new RandomBag<>();

        randomBag.add(2);
        randomBag.add(5);
        randomBag.add(6);
        randomBag.add(5);
        randomBag.add(5);

        Iterator<Integer> i = randomBag.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
