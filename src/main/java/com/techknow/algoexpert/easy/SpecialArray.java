package com.techknow.algoexpert.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialArray {

    public static void main(String[] args) {

        ArrayList<Object> value = new ArrayList<Object>(Arrays.asList(5, 2,
                new ArrayList<Object>(Arrays.asList(7, -1))));

        System.out.println(sumHelper(value, 1));
    }

    static int sumHelper(List<Object> value, int multiplier) {

        int sum = 0;

        for (Object e : value) {

            if (e instanceof ArrayList) {
                sum += sumHelper((ArrayList) e, multiplier + 1);
            } else {
                sum += (int) e;
            }
        }
        return sum * multiplier;
    }
}
