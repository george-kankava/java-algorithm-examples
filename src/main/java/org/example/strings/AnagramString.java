package org.example.strings;


import java.util.Arrays;

public class AnagramString {

    public static boolean isAnagram(String first, String second) {
        char[] firstCharArray = first.toCharArray();
        String anagram = second;
        for (char c : firstCharArray) {
            int indexOf = anagram.indexOf(c);
            if (indexOf != -1) {
                anagram = anagram.substring(0, indexOf) + anagram.substring(indexOf + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
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
        return stSecond.length() == 0 ? true : false;
    }

}
