package com.techknow.algoexpert.easy;

public class InsertionSort {

    public static void main(String[] args) {
        int array[] = { 8, 5, 2, 9, 5, 6, 3 };
        InsertionSort.sort(array);
       for(int value :array) {
           System.out.println(value);
       }
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {

            int j = i;

            while (j>0 && array[j] < array[j -1]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j -1] = temp;
                j--;
            }
        }

    }
}
