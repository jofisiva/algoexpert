package com.techknow.algoexpert.easy;

public class SmallestSubArray {
    public static void main(String[] args) {
        int array[] = {4,2,2,7,8,1,2,8,1,0};
        int targetsums =8;
        System.out.println(smallestSubArray(array,targetsums));
    }

    public static int smallestSubArray(int[] array, int targetsums) {

        int result =array[0];
        int currentValue = array[0];

        for (int i = 1; i < array.length;i++) {

            currentValue = Math.min(currentValue,currentValue+array[i]);
            result = Math.min(result,currentValue);
        }
        return result;
    }
}
