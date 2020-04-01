package com.techknow.algoexpert.easy;

public class MaxSubarrayWithSizeK {
    public static void main(String[] args) {
        int[] array = new int[] { 4, 2, 1, 7, 8, 1, 2, 8, 1, 0 };
        int k = 3;
        System.out.println(maxSubarrayWithSizeK(array, k));
    }

    public static int maxSubarrayWithSizeK(int[] array, int k) {

        int result = 0;

        int currentValue = 0;

        for (int i = 0; i < array.length; i++) {
            currentValue += array[i];

            if(i>=k-1) {
                result = Math.max(result, currentValue);
                currentValue-=array[i-(k-1)];
            }

        }
        return result;
    }
}
