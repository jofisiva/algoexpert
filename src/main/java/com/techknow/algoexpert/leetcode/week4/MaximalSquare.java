package com.techknow.algoexpert.leetcode.week4;

public class MaximalSquare {

    public static void main(String[] args) {

        char[][] data = new char[][] {
                { '1', '0', '1', '0', '0' },
                { '1', '0', '1', '1', '1' },
                { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' } };

        System.out.println(maximalSquare(data));
       // System.out.println(maximalSquare_1(data));
    }

    private static int maximalSquare(char[][] matrix) {

        if(matrix == null || matrix.length ==0) return 0;
        int rows = matrix.length;

        int column = matrix[0].length;

        int[][] dp = new int[rows + 1][column + 1];

        int longest = 0;
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= column; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));

                    longest = Math.max(longest, dp[i][j]);

                }
            }

        }

        return longest * longest;
    }


}
