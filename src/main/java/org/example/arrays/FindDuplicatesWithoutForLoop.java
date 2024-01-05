package org.example.arrays;

import java.util.Arrays;

public class FindDuplicatesWithoutForLoop {
    public static boolean hasDuplicates(int[] array) {
        return Arrays.stream(array).distinct().count() != array.length;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};

        System.out.println("Array 1 has duplicates: " + hasDuplicates(array1));
        System.out.println("Array 2 has duplicates: " + hasDuplicates(array2));
    }
}