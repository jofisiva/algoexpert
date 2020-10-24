package com.techknow.algoexpert.leetcode.week1;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public static void main(String[] args) {

        int array[] = { 1, 2, 3 };

        System.out.println(countElements(array));
    }

    public static int countElements(int[] array) {

        int count = 0;
        Set<Integer> values = new HashSet<Integer>();

        for (int value : array) {
            values.add(value);

        }

        for (int item : array) {
            int value = item + 1;
            if (values.contains(value)) {
                count = count + 1;
            }
        }

        return count;

    }
}
