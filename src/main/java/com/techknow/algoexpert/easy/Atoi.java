package com.techknow.algoexpert.easy;

import java.util.Scanner;

public class Atoi {
    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("\nEnter the numerator for 1st number : ");
        String str = sc.next();
       // String str = "-134";
        int num = atoi(str);
        if(num==-1) {
            System.out.println("No integer value is present");
        }
        System.out.println(num);
    }

    public static int atoi(String str) {


        if (str.length() == 0) {
            return -1;
        }
        int sign = 1;
        int res = 0;
        int i = 0;


        if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        }


        for (; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return -1;
            }
            res = res * 10 + Character.getNumericValue(str.charAt(i));
        }

        return sign * res;

    }
}
