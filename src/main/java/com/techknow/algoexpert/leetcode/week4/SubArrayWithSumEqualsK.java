package com.techknow.algoexpert.leetcode.week4;

import java.util.HashMap;

public class SubArrayWithSumEqualsK {
    public static void main(String[] args) {

        int[] arr = {1,1,1};
        int sum =2;
        System.out.println(subArrayWithSumEqualsK(arr, sum));
    }

    private static int subArrayWithSumEqualsK(int [] array, int k) {

        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum=0;
        map.put(0,1);

        for (int value : array) {

            sum += value;

            if (map.containsKey(sum - k)) {
                result += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return result;
    }
}
