package com.techknow.algoexpert.easy;

/**
 *
 */
public class Armstrong {

    public static void main(String[] args) {

        System.out.println(validArmStrong(151));
    }

    public static boolean validArmStrong(int number) {
    /*
    121 = %10 =1
    /10
     */

        int total = 0;
        int value = number;
        while (value > 0) {

            int lastNum = value % 10;

            value = value / 10;
            total += (lastNum * lastNum * lastNum);
        }
        return number == total
               ? true
               : false;

    }
}
