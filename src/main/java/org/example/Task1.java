package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

    public static Map<String, Integer> listToMap (List<String> strings) {

        Map<String, Integer> result = new HashMap<>();

        for (String str : strings) {
            result.put(str, str.length());
        }

        return result;
    }

}
