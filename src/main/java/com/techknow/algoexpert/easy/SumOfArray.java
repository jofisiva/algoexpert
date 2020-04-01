package com.techknow.algoexpert.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumOfArray {
    public static void main(String[] args) {
         result(new int[]{ 1, 4, 45, 6, 10, 8}, 14);
        List<int[]> result = linerSum(new int[]{ 1, 4, 45, 6, 10, 8}, 14);
         for(int[] a: result) {
             System.out.println(a[0] +","+a[1]);
         }

    }

   public static List<int[]> linerSum(int [] array ,int result) {
List<int[]> output = new ArrayList<>();

        Arrays.sort(array);
        int left =0 ;
        int right =array.length-1;
        while(left < right) {

            int sum = array[left]+array[right];
            if(sum==result) {
                output.add(new int[]{array[left],array[right]});
               // return new int[] {array[left],array[right]};
                left++;
                right--;
            }else if(sum>result) {
                right--;
            }
            else if(sum<result) {
                left++;
            }
        }
        return output;
   }
    public static void result(int [] array ,int result) {


        int sum =0;
        HashMap <Integer,Integer> resultset = new HashMap<Integer,Integer>();

        for(int i=0;i<array.length;i++) {
            sum = result -array[i];

            if(resultset.containsKey(sum)) {

                System.out.println("The pair of " +array[i] + " and "+ resultset.get(sum));
            }
            resultset.put(array[i], array[i]);
        }
    }
}
