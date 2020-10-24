package com.techknow.algoexpert.leetcode.week4;

public class BitwiseRangeSum {
    public static void main(String[] args) {
        int m = 5;
        int n = 7;

        while (n > m) {

            n = n & n - 1;
        }

        System.out.println(n & m);

    }
}
