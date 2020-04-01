package com.techknow.algoexpert.easy;

import java.util.Arrays;

public class SubArraySum {
    public static void main(String[] args) {
        // int array[] = new int[]{1, 2,3,7,5};
        int array[] = new int[] { 4, 2, 2, 7, 8, 1, 2, 8, 10 };
        int result[] = findLongestSubarrayBySum(array, 11);
        System.out.println(smallestSubArrayWithTarget(array,8));
        Arrays.stream(result).forEach(a -> System.out.println(a));
    }

    static int[] findLongestSubarrayBySum(int[] a, int s) {
        int[] result = new int[] { -1 };

        int sum = 0;
        int left = 0;
        int right = 0;

        while (right < a.length) {

            sum += a[right];

            while (left < right && sum > s) {
                sum -= a[left++];

            }
            if (sum == s && (result.length == 1 || result[1] - result[0] < right - left)) {
                result = new int[] { left + 1, right + 1 };
            }
            right++;
        }

        return result;

    }

    static int smallestSubArrayWithTarget(int[] a, int s) {
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < a.length; windowEnd++) {
            currentWindowSum += a[windowEnd];
            while (currentWindowSum >= s) {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                currentWindowSum -= a[windowStart];
                windowStart++;
            }
        }

        return minWindowSize;
    }
}
