package com.techknow.algoexpert.easy;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int n =Integer.valueOf(scanner.nextLine()).intValue();
        System.out.println(Fibonacci.fib(n));
        System.out.println(Fibonacci.fibn(n));
        //Read n value from keyboard
    }
    public static int fib(int n) {
        int nums[] = new int[n + 1];
        nums[0] = 1;
        nums[1] = 2;

        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
    public static int fibn(int n) {

        int paths [] ={1,1,2};

        for (int i = 3; i <= n; i++) {
            int count  = paths[0] + paths[1]+ paths[2];
            paths[0] = paths[1];
            paths[1] = paths[2];
            paths[2] =count;

        }
        return paths[2];
    }

}


