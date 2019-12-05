package com.techknow.algoexpert.easy;

public class BubbleSort {

    public static void main(String args[]) {

        int array[] = { 8, 5, 2, 9, 5, 6, 1 };
        BubbleSort.sorting(array);
        for (int value : array) {
            System.out.println(value);
        }
    }

    public static void sorting(int array[]) {
        boolean isSorted = false;
        int counter = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - counter; i++) {

                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }

            }
            counter++;
        }

    }
}
