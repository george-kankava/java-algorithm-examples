package org.example.tree;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("a", "a");
        treeMap.put("b", "b");
        treeMap.put("c", "c");
        System.out.println(treeMap);
    }
}
