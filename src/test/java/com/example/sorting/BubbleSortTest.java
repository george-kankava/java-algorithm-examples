package com.example.sorting;

import org.example.sort.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int [] array = {5, 2, 0, 1, 12, -5, 10, 8, 2};
        BubbleSort.bubbleSort(array);
        Assertions.assertArrayEquals(new int [] {-5, 0, 1, 2, 2, 5, 8, 10 ,12}, array);
        System.out.println(Arrays.toString(array));
    }
}
