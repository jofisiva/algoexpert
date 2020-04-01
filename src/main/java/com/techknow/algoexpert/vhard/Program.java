package com.techknow.algoexpert.vhard;

import java.util.Arrays;

class Program {
    public static int[] mergeSort(int[] array) {
        // Write your code here.
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

        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {

            if (leftArray[i] <= rightArray[j]) {
                sortedArray[k++] = leftArray[i++];

            } else {
                sortedArray[k++] = rightArray[j++];
            }

        }
        if (i < leftArray.length) {
            sortedArray[k++] = leftArray[i++];
        }
        if (j < rightArray.length) {
            sortedArray[k++] = rightArray[j++];
        }

        return sortedArray;
    }
}
