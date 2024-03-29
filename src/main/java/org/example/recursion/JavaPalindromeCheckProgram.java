package org.example.recursion;

public class JavaPalindromeCheckProgram {

    public static void main(String[] args) {
        boolean flag = palindromeCheck("sitonapanotis");
        System.out.println(flag);
        flag = palindromeCheck("nine");
        System.out.println(flag);
        flag = palindromeCheck("amanaplanacanalpanama");
        System.out.println(flag);
        flag = palindromeCheck("abdba");
        System.out.println(flag);

    }
    /* Recursive Java example to check for palindromes */

    public static boolean palCheck(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return palCheck(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static boolean palindromeCheck(String s) {

        if (s.isEmpty() || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return palindromeCheck(s.substring(1, s.length() - 1));
        }
        return false;
    }
}
