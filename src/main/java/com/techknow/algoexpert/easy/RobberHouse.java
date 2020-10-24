package com.techknow.algoexpert.easy;

public class RobberHouse {
    public static void main(String[] args) {

        int [] array= {2,7,9,3,1};
        System.out.println(rob(array));
    }

    public static int  rob(int [] array) {

        if (array == null || array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }

        int dp[] = new int[array.length];

        dp[0] = array[0];
        dp[1] = Math.max(array[0], array[1]);
        int num = array.length-1;
        for (int i = 2; i < array.length; i++) {
            dp[i] = Math.max(dp[i-1], array[i]+dp[i-2]);

        }

        return dp[num];

    }
}
