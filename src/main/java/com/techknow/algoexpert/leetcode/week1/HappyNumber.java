package com.techknow.algoexpert.leetcode.week1;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {

        System.out.println(isHappy(19));
        System.out.println(isHappy(15));
    }

    public static boolean isHappy(int num) {

        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
       HashSet<Integer> seen = new HashSet<Integer>();

        while (num!=1) {

            int runningSums = squareRoot(num);
            if(seen.contains(runningSums)) {
                return false;
            }
            //else {
                num = runningSums;
                seen.add(runningSums);
            //}

        }

        return true;
    }

    static int squareRoot(int num) {

        int runningSums = 0;
        while (num != 0) {
            int lastdigit = num % 10;
            runningSums = runningSums + (lastdigit * lastdigit);
            num = num / 10;
        }
        return runningSums;
    }
}
