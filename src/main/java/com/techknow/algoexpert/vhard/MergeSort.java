package com.techknow.algoexpert.vhard;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] result = mergeSort(new int[] { 1, 2, 3, 4, 3 });

        Arrays.stream(result).forEach(System.out::println);
    }


    public static int[] mergeSort(int[] array) {

        if (array.length<=1) {
            return array;
        }

        int middle = array.length / 2;

        int[] leftArray = Arrays.copyOfRange(array, 0, middle);
        int[] rightArray = Arrays.copyOfRange(array, middle , array.length);

        return mergeHelper(mergeSort(leftArray), mergeSort(rightArray));

    }

    public static int[] mergeHelper(int[] leftArray, int[] rightArray) {

        int sortedArray[] = new int[leftArray.length + rightArray.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftArray.length && j < rightArray.length) {

            if (leftArray[i] <= rightArray[j]) {
                sortedArray[k++] = leftArray[i++];

            } else {
                sortedArray[k++] = rightArray[j++];
            }

        }
        while (i < leftArray.length) {
            sortedArray[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            sortedArray[k++] = rightArray[j++];
        }

        return sortedArray;
    }

}

