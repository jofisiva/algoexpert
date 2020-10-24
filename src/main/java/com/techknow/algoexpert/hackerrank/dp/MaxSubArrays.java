package com.techknow.algoexpert.hackerrank.dp;

public class MaxSubArrays {
    public static void main(String[] args) {


      //  int arr[] = {-2,1,3,-4,5};
        //int arr[] = {3,7,4,6,5};
        int arr[] = {2, 1, 5 ,8, 4};
       int sum = maxSubSet(arr);
       System.out.println(sum);


    }
    static int maxSubSet(int [] arr) {

        if(arr.length==1) return arr[0];

        int result [] = new int[arr.length];
        result[0]=arr[0]; // FIRST ELEMENT
        result[1]= Math.max(arr[1],result[0]); // Max

        for (int i = 2; i <arr.length; i++) {
            result[i] = arr[i]+result[i-2]; //Adjacent sum

            result[i]  = Math.max(arr[i], Math.max(result[i], result[i-1])); //Comparing max


        }

        return result[arr.length-1];





    }
}
