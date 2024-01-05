package org.example.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertionSort {

    public static void main(String[] args) {

        Integer [] array = {35, 20, -15, 7, 55, 1, -22};
        System.out.println("before : " + Arrays.toString(array));
        insertionSortRecursive(array, array.length);
        System.out.println("after recursive : " + Arrays.toString(array));
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.shuffle(list);
        array = list.toArray(new Integer [] {});
        System.out.println("after shuffle : " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("after iterative : " + Arrays.toString(array));
        
    }

    public static void insertionSortRecursive(Integer[] array, int itemNumber) {

        if (itemNumber == 1) {
            System.out.printf("before return : %d --------- %n", itemNumber);
            return;
        }

        insertionSortRecursive(array, itemNumber - 1);;

        shiftElements(array, itemNumber - 1);

        System.out.printf("At step : %d : %s ------------ %n", itemNumber, Arrays.toString(array));

    }

    public static void insertionSort(Integer [] array) {

        for (int i = 1; i < array.length; i++) {
            shiftElements(array, i);
        }

    }

    private static void shiftElements(Integer[] array, int i) {
        int element = array[i];
        int index = i;
        while(index > 0 && element < array[index - 1]) {
            array[index] = array[index - 1];
            index--;
        }
        array[index] = element;
    }
}
