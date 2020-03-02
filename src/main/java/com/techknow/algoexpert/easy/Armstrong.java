package com.techknow.algoexpert.easy;

import java.util.Scanner;

/**
 *
 */
public class Armstrong {

    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);

        System.out.println(validArmStrong(Integer.parseInt(scanner.nextLine())));
        System.out.println("Enter the UserName");
        System.out.println(scanner.nextLine());
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
