package com.techknow.algoexpert.leetcode.week3;

public class StringParenthesis {

    public static void main(String[] args) {
        String validString = "(*))";
        System.out.println(checkValidParenthesis(validString));
    }

    private static boolean checkValidParenthesis(String validString) {

        int n = validString.length();
        int leftBalance = 0;
        int rightBalance = 0;

        for (int i = 0; i < n; i++) {

            if (validString.charAt(i) == '(' || validString.charAt(i) == '*') {
                leftBalance++;
            } else {
                leftBalance--;
            }

            if (leftBalance < 0)
                return false;
        }

        if (leftBalance == 0)
            return true;

        for (int i = n-1; i >= 0; i--) {

            if (validString.charAt(i) == ')' || validString.charAt(i) == '*') {
                rightBalance++;
            } else {
                rightBalance--;
            }

            if (rightBalance < 0)
                return false;

        }

        return true;
    }

}
