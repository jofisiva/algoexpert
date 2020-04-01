package com.techknow.algoexpert.easy;

import java.util.HashMap;

public class MaxSubArray {
    public static void main(String[] args) {
       // int [] nums ={-2,1,-3,4,-1,2,1,-5,4};
       int [] nums ={-2, -3, 4, -1, -2, 1, 5, -3};
System.out.println(maxSubArray(nums));

       // System.out.println(maxSubArray(nums));
   /* int [] output =twoSum(nums,6);
    for(int value:output) {
        System.out.print(value+" ");
    }*/

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap();

        /*for (int i=0 ; i<nums.length;i++){
            hashMap.put(nums[i],i);
        }*/
        for (int i=0 ; i<nums.length;i++) {

            int difference = target - nums[i];
            if(!hashMap.containsKey(difference))
            {
                hashMap.put(nums[i],i);
            } else {
                return new int[] {i, hashMap.get(difference)};
            }
                   // && !(i==  hashMap.get(difference))

        }
        return new int[]{0,0};


    }
    public static int maxSubArray(int[] nums) {

        int result = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            System.out.println(nums[i] + ": " +sum);
            sum = Math.max(nums[i], sum + nums[i]);
            result = Math.max(sum, result);
        }
        return result;
    }
}
