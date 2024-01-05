package com.example.strings;

import org.example.arrays.DuplicateInSequentialArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuplicateInSequentialArrayTest {

    @Test
    public void testFindDuplicate() {
        int duplicate = DuplicateInSequentialArray.findDuplicate(new int[] {1, 2, 3, 3, 4});
        Assertions.assertEquals(3, duplicate);
    }
}
