package org.example.sort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int [] array, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int middle = (start + end) / 2;
        mergeSort(array, start, middle);
        mergeSort(array, middle, end);

        merge(array, start, middle, end);

    }

    public static void merge(int [] array, int start, int middle, int end) {

        if (array[middle] <= array[middle - 1]) {
            return;
        }

        int i = start;
        int j  = middle;
        int [] temp = new int [end - start];
        int index = 0;
        while (i < middle && j < end) {
            if (array[i] >= array[j]) {
                temp[index] = array[i];
                i++;
            } else  {
                temp[index] = array[j];
                j++;
            }
            index++;
        }
        if (i < middle) {
            System.arraycopy(array, i, temp, index, middle - i);
        }
        if (j < end) {
            System.arraycopy(array, j, temp, index, end - j);
        }
        System.arraycopy(temp, 0, array, start, end - start);
    }

    public static void main(String[] args) {
        int [] array = {5, 1, 3, 0, 7, 3, 1, -2, 0};
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
        MergeSort.mergeSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }
}
