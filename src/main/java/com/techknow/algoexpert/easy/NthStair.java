package com.techknow.algoexpert.easy;

import java.util.Scanner;
class NthStair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(NthStair.fib(Integer.valueOf(scanner.nextLine()).intValue()));
        //Read n value from keyboard
    }

    public static int nSairCase(int n) {
        if (n == 2)
            return 2;
        if (n == 1)
            return 1;

        if (n == 0)
            return 0;

        return nSairCase(n - 1) + nSairCase(n - 2);
    }

    public static int fib(int n) {
        int nums[] = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
}