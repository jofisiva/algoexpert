package com.techknow.algoexpert.easy;

public class SelectionSort {

    public static void main(String[] args) {

        int array[] = { 8, 5, 2, 9, 5, 6, 3 };

        SelectionSort.sort(array);

        for (int value : array) {
            System.out.println(value);
        }
    }

    public static void sort(int[] array) {
        int currentIdx = 0;

        while (currentIdx < array.length - 1) {

            int smallIdx = currentIdx;

            for (int i = currentIdx + 1; i < array.length; i++) {
                if (array[smallIdx] > array[i]) {
                    smallIdx = i;
                }
            }
            int temp = array[currentIdx];
            array[currentIdx] = array[smallIdx];
            array[smallIdx] = temp;

            currentIdx = currentIdx + 1;
        }
    }
}
