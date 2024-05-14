package org.example;

import java.util.List;
import java.util.Random;

public class Task3 {

    public static void addElements(List<Integer> list, int numElements) {
        for (int i = 0; i < numElements; i++) {
            list.add(i);
        }
    }


    public static void accessElements(List<Integer> list, int numAccesses) {
        Random rand = new Random();
        int size = list.size();
        for (int i = 0; i < numAccesses; i++) {
            int index = rand.nextInt(size);
            list.get(index);
        }

    }






}
