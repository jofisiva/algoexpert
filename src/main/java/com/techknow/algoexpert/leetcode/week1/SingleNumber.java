package com.techknow.algoexpert.leetcode.week1;

public class SingleNumber {
    public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{2,2,1}));

    }

    private static int singleNumber(int nums[]) {

        for(int i = 1; i < nums.length;i++) {
            nums[0] = nums[0]^nums[i];
         //   System.out.print(nums[0]);
        }
        System.out.println();
        return nums[0];
    }
}
