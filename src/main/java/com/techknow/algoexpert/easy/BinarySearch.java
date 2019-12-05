package com.techknow.algoexpert.easy;

import org.junit.jupiter.api.Assertions;

public class BinarySearch {

    public static void main(String args[]) {

        int[] array = new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 };

        Solution1 solution1 = new Solution1();
        int result = solution1.findNumber(array, 33, 0, array.length - 1);
        //System.out.println(result);
        Assertions.assertEquals(result, 3);
    }

}

class Solution1 {

    int findNumber(int[] array, int target, int left, int right) {
        /*for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }*/

        while (left <= right) {
            int middle = ( left + right ) / 2;
            int potentialMatch = array[middle];
            if (target == potentialMatch) {
                return middle;
            } else if (target < potentialMatch) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }
}
