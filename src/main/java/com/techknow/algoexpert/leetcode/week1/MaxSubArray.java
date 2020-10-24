package com.techknow.algoexpert.leetcode.week1;

public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int [] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    private static int maxSubArray(int [] nums) {
int currentSum = nums[0];
int result = nums[0];

for (int i = 1; i<nums.length; i++)
{
    currentSum = Math.max(nums[i], currentSum+nums[i]);
    result = Math.max(currentSum, result);
    System.out.println(result);
}
  return result;

    }
}
