package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    public static Map<Integer, List<String>> listToMap2 (List<String> strings) {

        Map<Integer, List<String>> result = new HashMap<>();

        for (String str : strings) {

            int length = str.length();

            List<String> list = result.computeIfAbsent(length, k -> new ArrayList<>());

            list.add(str);
        }

        return result;
    }


}
