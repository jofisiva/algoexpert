package com.techknow.algoexpert.medium;

public class LongestPalindromeFinder {
    public static void main(String[] args) {
      /*  System.out.println(longestPalindromeString("1234"));
        System.out.println(longestPalindromeString("12321"));
        System.out.println(longestPalindromeString("9912321456"));
        System.out.println(longestPalindromeString("9912333321456"));
        System.out.println(longestPalindromeString("12145445499"));
        System.out.println(longestPalindromeString("1223213"));*/
        System.out.println(longestPalindromeString("abaxyzzyxf"));
    }

    static public String palindromeString(String value, int left, int right) {

        if (left > right)
            return null;
        while (left >= 0 && right < value.length() && value.charAt(left) == value.charAt(right)) {

            left--;
            right++;
        }
        return value.substring(left +1, right);

    }

    static public String longestPalindromeString(String value) {

        if (value == null)
            return "";
        if (value.length() == 1)
            return value;

        String longest = value.substring(0, 1);

        for (int i = 0; i < value.length() - 1; i++) {
            String palindromeString = palindromeString(value, i, i);
            if (palindromeString.length() > longest.length()) {
                longest = palindromeString;
            }
            String evenPalindromeString = palindromeString(value, i, i + 1);
            if (evenPalindromeString.length() > longest.length()) {
                longest = evenPalindromeString;
            }

        }
        return longest;

    }

}
