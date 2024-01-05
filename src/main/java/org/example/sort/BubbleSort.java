package org.example.sort;

public class BubbleSort {

    public static void bubbleSort(int [] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1, array);
                }
            }
        }
    }

    public static void swap(int i, int j, int [] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
