package org.example.sort;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int [] array = {4, 4, 1, 3, 2, 7, 9, 8, 3, 1, 20};

        int [] count = new int [21];
        for (int k : array) {
            count[k]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            int amount = count[i];
            for (int j = 0; j < amount; j++) {
                array[index++] = i;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
