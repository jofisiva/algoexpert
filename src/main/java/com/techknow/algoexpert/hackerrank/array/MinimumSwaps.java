package com.techknow.algoexpert.hackerrank.array;

import java.util.Arrays;

public class MinimumSwaps {

    static int swapcount = 0;

    public static void main(String[] args) {
        int array[] = { 7, 1, 3, 2, 4, 5, 6 };

        minimumSwaps(array);
        Arrays.stream(array).forEach(System.out::println);
        System.out.println(swapcount);

    }

    private static void minimumSwaps(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] != i + 1) {
                int t = i;
                while (array[t] != i + 1) {
                    t++;
                }
                swapcount++;
                int temp = array[t];
                array[t] =array[i];
                array[i] = temp;

            }

        }

    }

}
