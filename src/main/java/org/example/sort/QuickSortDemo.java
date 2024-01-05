package org.example.sort;

import java.util.Arrays;

public class QuickSortDemo {

    public static void main(String args[]) { // unsorted integer array
        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));
        QuickSortDemo algorithm = new QuickSortDemo();
        // sorting integer array using quicksort algorithm
        algorithm.quickSort(unsorted, 0, unsorted.length);
        // printing sorted array
        System.out.println("Sorted array :" + Arrays.toString(unsorted));
        System.out.println(1 << 30);
        System.out.println(0x7fffffff);
    }
    /** * Java Program sort numbers using QuickSort Algorithm. QuickSort is a divide * and conquer algorithm, which divides the original list, sort it and then * merge it to create sorted output. * * @author Javin Paul */

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(int[] arr, int begin, int end) {

        int i = begin;
        int j = end - 1;
        int pivot = arr[j];

        while (i < j) {

            while (arr[j] > pivot)
                j--;

            while (arr[i] < pivot)
                i++;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        arr[j] = pivot;
        return j;

//        int pivot = arr[end];
//        int i = (begin-1);
//
//        for (int j = begin; j < end; j++) {
//            if (arr[j] <= pivot) {
//                i++;
//
//                int swapTemp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = swapTemp;
//            }
//        }
//
//        int swapTemp = arr[i+1];
//        arr[i+1] = arr[end];
//        arr[end] = swapTemp;
//
//        return i+1;
    }
}