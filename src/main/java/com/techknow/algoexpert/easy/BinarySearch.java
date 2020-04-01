package com.techknow.algoexpert.easy;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[]) {

        int[] array = new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 };

        Solution1 solution1 = new Solution1();
        //int result = solution1.findNumber(array, 33, 0, array.length - 1);
        //System.out.println(result);
        System.out.println(findNumber(new int[] {54,121,187,285,376}, 187)+1);
        //Assertions.assertEquals(result, 3);
    }

    public static int findNumber(int [] array, int result) {

        int left = 0;
        int right = array.length-1;
        Arrays.sort(array);
                while(left <= right) {
                    int middle = (int) Math.floor((left + right) / 2);
                    int potentialMatch = array[middle];

                    if(potentialMatch == result) {
                        return middle;
                    }
                    else if (result<potentialMatch) {
                        right = middle - 1;
                    }else  {
                      left = middle + 1;
                    }
                }
                return  -1;
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
