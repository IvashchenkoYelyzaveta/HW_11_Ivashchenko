package org.example;

import java.util.*;

import static org.example.Task1.listToMap;
import static org.example.Task2.listToMap2;
import static org.example.Task3.accessElements;
import static org.example.Task3.addElements;

public class Main {
    public static void main(String[] args) {

        List<String> strings = List.of("тут", "там", "стол");
        Map<String, Integer> result = listToMap(strings);
        System.out.println(result);

        System.out.println();

        List<String> strings2 = List.of("тут", "там", "стол");
        Map<Integer, List<String>> result2 = listToMap2(strings2);
        System.out.println(result2);

        System.out.println();

        int numElements = 1_000_000;
        int numAccesses = 1_000_000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Добавление элементов в ArrayList
        long startTime = System.currentTimeMillis();
        addElements(arrayList, numElements);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList add time: " + (endTime - startTime) + " ms");

        // Добавление элементов в LinkedList
        startTime = System.currentTimeMillis();
        addElements(linkedList, numElements);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList add time: " + (endTime - startTime) + " ms");

        // Доступ к элементам ArrayList
        startTime = System.currentTimeMillis();
        accessElements(arrayList, numAccesses);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList access time: " + (endTime - startTime) + " ms");

        // Доступ к элементам LinkedList
        startTime = System.currentTimeMillis();
        accessElements(linkedList, numAccesses);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList access time: " + (endTime - startTime) + " ms");


    }
}