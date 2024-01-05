package org.example.arrays;

public class FindDuplicatesSumMatchingNumber {


    public static void main(String[] args) {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
        prettyPrint(numbers, 7);
        prettyPrint(numbersWithDuplicates, 7);
    }
    public static void prettyPrint(int[] numbers, int sum) {

        for (int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == sum) {
                    System.out.println("found pair " + numbers[i] + ", " + numbers[j] + ": sum " + sum);
                }
            }
        }
    }

}
