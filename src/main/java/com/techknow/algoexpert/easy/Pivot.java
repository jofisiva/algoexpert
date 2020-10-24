package com.techknow.algoexpert.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Pivot {

    public static void main(String[] args) {
   //  int array[]= { 1, 7, 3, 6, 5, 6 };

     Scanner s = new Scanner(System.in);

     int array[] = Arrays.stream(s.nextLine().replace(" ","").split(",")).mapToInt(Integer::parseInt).toArray();

     System.out.println(pivotIndex(array));
    }

    public static int pivotIndex(int[] nums) {

        int total_sum =0;

        for(int num:nums) {
            total_sum+=num;
        }

        int left_sum=0;
        for(int i=0;i<nums.length;i++) {

            if(total_sum-left_sum-nums[i]==left_sum){
                return i;
            }

            left_sum+=nums[i];
        }

        return -1;

    }
}
