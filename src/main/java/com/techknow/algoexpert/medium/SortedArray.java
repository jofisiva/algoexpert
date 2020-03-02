package com.techknow.algoexpert.medium;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
     int [] result =   specialArray(new int[] {4,1,5,6,2});

     for(int i : result) {
         System.out.println(i);
     }

       result =   specialArray(new int[] {2,1,2});
        for(int i : result) {
            System.out.println(i);
        }
    }


    public static int[] specialArray (int [] array) {

        int[] result = new int[array.length];
Arrays.sort(array);
        int left = 0;
        int right = array.length-1;

        boolean flag = true;
        for(int i = 0; i < array.length; i++) {


            if(flag) {
                result[i] = array[right];
                right--;
            }else {
                result[i] = array[left];
                left++;
            }
            flag = !flag;
        }
        return result;
    }
}
