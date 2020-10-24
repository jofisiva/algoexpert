package com.techknow.algoexpert.leetcode.week1;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        int nums[] = { 0, 1, 0, 3, 12 };
      // moveZeroes(nums);
        //Arrays.stream(nums).forEach(System.out::print);
        optimalMove(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

    private static void  moveZeroes(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

       // return nums;
    }

    private static void optimalMove(int [] nums) {

        int index =0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i]!=0) {
                swap(nums, index++,i);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp =  nums[i];
         nums[i] = nums[j];
        nums[j] = temp;
    }
}
