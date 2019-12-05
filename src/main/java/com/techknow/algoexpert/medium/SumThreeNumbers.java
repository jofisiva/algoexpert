package com.techknow.algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumThreeNumbers {

    public static void main(String[] args) {

        int array[] = { 12, 3, 1, 2, -6, 5, -8, 6 };

        List<Integer[]> result = threeNumberSum(array, 0);

        result.forEach(res -> {
            System.out.println(res[0] + " , " + res[1] + " , " + res[2]);

        });
    }

    static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> result = new ArrayList<>();

        Arrays.sort(array);

        for (int i = 0; i < array.length - 2; i++) {
            int currentValue = array[i];
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {

                int sum = currentValue + array[left] + array[right];
                if (targetSum == sum) {
                    result.add(new Integer[] { currentValue, array[left], array[right] });
                    left++;
                    right--;
                } else if (sum < targetSum) {
                    left++;
                } else if (sum > targetSum) {
                    right--;
                }

            }

        }
        return result;
    }
}
