package org.example.arrays;

public class DuplicateInSequentialArray {

    public static int findDuplicate(int [] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = new int[] {2, 2, 3, 4, 5, 6, 1};
        int sumWithDuplicates = 0;
        for (int i : arr) {
            sumWithDuplicates += i;
        }


        float fl = (arr.length - 1) * (arr.length / 2f);
        System.out.println(sumWithDuplicates);
        System.out.println(fl);
        System.out.println(sumWithDuplicates - fl);
    }
}
