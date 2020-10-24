package com.techknow.algoexpert.leetcode.week4;

public class CanJump {
    public static void main(String[] args) {
        //int array[] = {2,3,1,1,4};
int array[] ={3,2,1,0,4};
        System.out.println(canJump(array));
    }

    private static boolean canJump(int[] array) {

        int lastGoodIndexPosition = array.length-1;

        for(int i=array.length-1;i>=0;i--) {

            if(i+array[i]>=lastGoodIndexPosition) {
                lastGoodIndexPosition=i;
            }
        }

        return lastGoodIndexPosition==0;

    }

}
