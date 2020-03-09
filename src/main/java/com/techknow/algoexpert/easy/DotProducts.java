package com.techknow.algoexpert.easy;

public class DotProducts {

    public static void main(String[] args) {
System.out.println(productSumArray(new int[] {-4,5,8},new int[]{2,6,3}));
    }

    public static int productSumArray(int [] array1, int [] array2) {
        int left =0;
        int sum =0;
        int right = array1.length;

        while(left <right) {
          sum = sum + array1[left] * array2[left];
          left++;
        }
        return sum;
    }
}
