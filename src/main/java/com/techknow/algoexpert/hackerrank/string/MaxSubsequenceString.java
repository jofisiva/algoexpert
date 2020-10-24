package com.techknow.algoexpert.hackerrank.string;

public class MaxSubsequenceString {
    public static void main(String[] args) {
        String s1 ="ABCDEF";
        String s2 ="FBDAMN";

        System.out.println(commonChild(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length()));
    }

    private static int commonChild(char[] s1, char[] s2, int m, int n) {

        int memo[][] = new int[m+1][n+1];
for(int i=0;i<=m; i++) {
    for(int j=0;j<=n; j++) {
        if(i==0 || j==0) {
            memo[i][j] =0;
        }else if(s1[i-1] == s2[j-1]) {
            memo[i][j] = memo[i - 1][j-1]+1;
        }else {
            memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
        }
    }
}



return memo[m][n];


    }
}
