package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MaxNumberFrequency {

    public static void main(String[] args) {
        System.out.println("MaxNumberFrequency.countMaxNumberFrequency(new int [] {1, 2, 2, 3, 1, 4, 4, 3} ) : " + MaxNumberFrequency.countMaxNumberFrequency(new int [] {1, 2, 2, 3, 1, 4, 4, 3} ));
    }

    public static int countMaxNumberFrequency(int [] digits) {

        if (digits == null || digits.length == 0) {
            return 0;
        }

        int maxInDigits = 0;
        for (int digit : digits) {
            if (digit > maxInDigits)
                maxInDigits = digit;
        }


        int [] counterArray = new int [maxInDigits + 1];
        for (int digit : digits) {
            counterArray[digit]++;
        }

        int maxInCounterArray = 0;
        for (int i : counterArray) {
            if (i > maxInCounterArray) {
                maxInCounterArray = i;
            }
        }

        int amountOfFrequency = 0;
        for (int i : counterArray) {
            if (maxInCounterArray == i) {
                amountOfFrequency++;
            }
        }

        System.out.println("amountOfFrequency * maxInCounterArray : " + amountOfFrequency * maxInCounterArray);


        Map<Integer, Integer> counter = new HashMap<>();

        System.out.println("---");

        Arrays.stream(digits).distinct().forEach(System.out::println);

        System.out.println("---");

        for (int digit : digits) {
//            counter.compute(digit, (key, value) -> {
//                if (value == null) {
//                    return 1;
//                } return ++value;
//            });

            counter.putIfAbsent(digit, 0);
            counter.computeIfPresent(digit, (key, value) -> ++value);

//            Integer count = counter.get(digit);
//            if (count == null) {
//                counter.put(digit, 1);
//            } else {
//                counter.put(digit, ++count);
//            }
        }

        int maxFrequency = 0;
        int maxFrequencyCounter = 0;
        for (int value : counter.values()) {
            if (value > maxFrequency) {
                maxFrequency = value;
                maxFrequencyCounter++;
            } else if (value == maxFrequency){
                maxFrequencyCounter++;
            }
        }

        Optional<Integer> max = counter.values()
                .stream()
                .max(Integer::compare);

        long count = counter.values()
                .stream()
                .filter(v -> v == 2)
                .count();


        max.ifPresent(integer -> System.out.println("max.get() : " + max.get() * count));

        return maxFrequency * maxFrequencyCounter;


    }
}
