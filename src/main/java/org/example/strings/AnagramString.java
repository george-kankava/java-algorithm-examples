package org.example.strings;


import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {
        System.out.println(isAnag("army", "mary"));
    }

    public static boolean isAnag(String first, String second) {
        for (char c : first.toCharArray()) {
            int indexInSecond = second.indexOf(c);
            if (indexInSecond != -1) {
                second = second.substring(0, indexInSecond) + second.substring(indexInSecond + 1);
            } else {
                return false;
            }
        }
        return second.isEmpty();

    }

    public static boolean isAnagram(String first, String second) {
        for (char c : first.toCharArray()) {
            int indexOf = second.indexOf(c);
            if (indexOf != -1) {
                second = second.substring(0, indexOf) + second.substring(indexOf + 1);
            } else {
                return false;
            }
        }
        return second.isEmpty();
    }

    public static boolean isAnagramBySorting(String first, String second) {
        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();
        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);
        return Arrays.equals(firstCharArray, secondCharArray);
    }

    public static boolean isAnagramByWithStringBuilder(String first, String second) {
        char[] firstCharArray = first.toCharArray();
        StringBuilder stSecond = new StringBuilder(second);
        for (char c: firstCharArray) {
            int index = stSecond.indexOf(String.valueOf(c));
            if (index != -1) {
                stSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return stSecond.length() == 0;
    }

}
