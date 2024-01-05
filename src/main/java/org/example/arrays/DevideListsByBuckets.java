package org.example.arrays;

import com.sun.tools.javac.Main;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

    class DevideListsByBuckets {
        public static void main(String[] args) {

            DevideListsByBuckets devideListsByBuckets = new DevideListsByBuckets();
            List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
            List<List<Integer>> result = devideListsByBuckets.splitIntoBuckets(list, 3);
            // the result should be [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]
            System.out.println(result);

            List<String> list2 = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
            List<List<String>> result2 = devideListsByBuckets.splitIntoBuckets(list2, 3);
            System.out.println(result2);
            // the result2 should be [[a, b, c], [d, e, f], [g, h, i], [j]]
        }

        /**
         * Split the given flat list into a list of nested lists. Each nested list
         * should
         * contain n elements. The last element of the list should contain the remaining
         * elements.
         */
        public <T> List<List<T>> splitIntoBuckets(List<T> list, int bucketSize) {
            int listAmount = list.size() / bucketSize + 1;
            List<List<T>> lists = new ArrayList<>();
            int index = 0;
            for (int i = 0; i < listAmount; i++) {
                List<T> l = new ArrayList<>();
                for (int j = 0; j < bucketSize; j++) {
                    if (index < list.size()) {
                        l.add(list.get(index++));
                    }
                }
                lists.add(l);
            }
            return lists;
        }
    }
