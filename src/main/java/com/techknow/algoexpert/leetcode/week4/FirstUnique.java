package com.techknow.algoexpert.leetcode.week4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstUnique {

    Set<Integer> unique
             = new LinkedHashSet<Integer>(); //
    Set<Integer> all = new HashSet<Integer>();

    public FirstUnique(int [] nums) {
       for(int num : nums) {
           add(num);
       }
    }


    public int showFirstUnique() {

        if(unique.isEmpty()) {
            return -1;
        }

      return  unique.iterator().next();
    }

    public void add(int value) {

        if(all.add(value)){
            unique.add(value);
        }else {

            unique.remove(value);
        }
    }

    public static void main(String args[]) {
        FirstUnique firstUnique = new FirstUnique(new int[]{2,3,5});
        firstUnique.showFirstUnique(); // return 2
        firstUnique.add(5);            // the queue is now [2,3,5,5]
        firstUnique.showFirstUnique(); // return 2
        firstUnique.add(2);            // the queue is now [2,3,5,5,2]
        firstUnique.showFirstUnique(); // return 3
        firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
        firstUnique.showFirstUnique(); // return -1
    }

}
