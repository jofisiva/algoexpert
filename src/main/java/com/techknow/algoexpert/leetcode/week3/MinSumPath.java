package com.techknow.algoexpert.leetcode.week3;

public class MinSumPath {

    public static void main(String[] args) {
 int [][] grid ={
         {1,3,1},
         {1,5,1},
         {4,2,1}
 };

        System.out.println(minSumPath(grid));
    }

    public static int minSumPath(int [][] grid, int start) {


        if(grid==null || grid.length==0) {
            return 0;
        }

        int [][]dp   =new int[grid.length][grid[0].length];


        for(int i=grid.length-1;i>0;i--) {
            for(int j= 0; j <grid[0].length; j++) {

                dp[i][j] += grid[i][j];

                if(i>0 && j>0) {
                    dp[i][j]+= Math.min(dp[i-1][j],dp[i][j-1]);
                }else if(j>0) {
                    dp[i][j]+= dp[i][j-1];
                }else if(i>0) {
                    dp[i][j]+= dp[i-1][j];
                }
            }
        }


        return dp[dp.length-1][dp[0].length-1];
    }

    public static int minSumPath(int [][] grid) {


        if(grid==null || grid.length==0) {
            return 0;
        }

        int [][]dp   =new int[grid.length][grid[0].length];


        for(int i=0;i<grid.length;i++) {
            for(int j= 0; j <grid[0].length; j++) {

                dp[i][j] += grid[i][j];

                if(i>0 && j>0) {
                    dp[i][j]+= Math.min(dp[i-1][j],dp[i][j-1]);
                }else if(j>0) {
                    dp[i][j]+= dp[i][j-1];
                }else if(i>0) {
                    dp[i][j]+= dp[i-1][j];
                }
            }
        }


        return dp[dp.length-1][dp[0].length-1];
    }
}
