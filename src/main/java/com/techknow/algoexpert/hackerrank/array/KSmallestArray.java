package com.techknow.algoexpert.hackerrank.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class KSmallestArray {

    public static void main(String[] args) {
        int array[] = { 9, 3, 2, 7, 2, 5, 3, 8 };

        Scanner s = new Scanner(System.in);

        System.out.println(findSmallest(array, 4));
    }

    private static int findSmallest(int[] array, int k) {

        Integer[] inputArray = IntStream.of(array).boxed().toArray(Integer[]::new);
        TreeSet<Integer> original = new TreeSet<Integer>(Arrays.asList(inputArray));
        Integer[] result = original.toArray(new Integer[0]);

        return result[k - 1];

    }
}

