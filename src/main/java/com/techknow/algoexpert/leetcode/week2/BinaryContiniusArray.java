package com.techknow.algoexpert.leetcode.week2;

import java.util.HashMap;

public class BinaryContiniusArray {
    public static void main(String[] args) {

        int array[] = {0,1};

        System.out.println(continiousArray(array));
    }

    public static int continiousArray(int [] array) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max_length =0;
        int count =0;
map.put(0,-1);

        for(int i=0;i<array.length;i++) {


            if(array[i]==0) {
                count+=-1;
            }
            else {
                count +=1;
            }

            if(map.containsKey(count)) {
               max_length = Math.max(max_length, i- map.get(count));
            }else {
                map.put(count, i);
            }
        }




        return max_length;

    }
}
