package org.example.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAccessOrderExample {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>(32, .75f, true);
        map.put("a", "valueA");
        map.put("b", "valueB");
        map.put("c", "valueC");
        map.put("d", "valueD");
        map.put("e", "valueE");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("-----");

        System.out.println(map.get("b"));
        System.out.println(map.get("a"));


        System.out.println("-----");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

}
