package com.techknow.algoexpert.easy;

import java.util.HashSet;

public class FirstOFDuplicate {
    public static void main(String[] args) {
System.out.println(findFirstDuplicate(new int[]{2,1,3,5,3,2}));

    }

    static int findFirstDuplicate(int array[]) {
        HashSet <Integer> set = new HashSet<>();

        for(int i=0;i<array.length; i++) {

            if(set.contains(array[i])) {
                return array[i];
            }
            set.add(array[i]);
        }
        return -1;
    }
}
