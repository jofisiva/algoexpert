package com.techknow.algoexpert.leetcode.week3;

public class NumIslands {
    public static void main(String[] args) {

        //char [][] numIslands = { {'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};

       // char[][] numIslands = { { 1 } };

        char[][] data = new char[][] {
                { '1', '0', '1', '0', '0' },
                { '1', '0', '1', '1', '1' },
                { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' } };
        System.out.println(numIslands(data));
    }

    public static int numIslands(char array[][]) {

        int numIslands = 0;

        if(array==null || array.length == 0) {
            return 0;
        }
        if(array.length == 1 && array[0][0] =='1') {
            return 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == '1') {
                    numIslands += dfs(array, i, j);
                }

            }
        }

        return numIslands;
    }

    private static int dfs(char[][] array, int i, int j) {

        if (i < 0 || i >= array.length || j < 0 || j >= array[i].length || array[i][j] == '0') {
            return 0;
        }

        array[i][j] = '0';

        dfs(array, i - 1, j);
        dfs(array, i + 1, j);
        dfs(array, i, j - 1);
        dfs(array, i, j + 1);
        return 1;
    }

}
