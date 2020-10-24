package com.techknow.algoexpert.leetcode.week2;

import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {

        int nums[] ={2,7,4,1,8,1};
        System.out.println(lastStoneWeight(nums));
    }

    public static int lastStoneWeight(int [] nums) {

        PriorityQueue<Integer> minStack = new PriorityQueue<Integer>();

        for(int i = 0; i < nums.length; i++) {
            minStack.add(-nums[i]);
        }


        while(minStack.size()>1) {

            int stoneOne = minStack.remove();
            int stoneTwo = minStack.remove();

            if (stoneOne != stoneTwo) {
                minStack.add(-(stoneOne - stoneTwo));
            }

        }
        return   minStack.isEmpty()?0: minStack.remove();
    }

}
