package com.techknow.algoexpert.hackerrank.array;

public class EqualiseArray {
    public static void main(String[] args) {

        int[] intArray = { 1, 2, 2, 3 };
        System.out.println(equaliseArray(intArray));
    }

    private static int equaliseArray(int[] intArray) {
        int len = intArray.length;
        int aux[] = new int[101];

        for (int i = 0; i < len; i++) {
            int index = intArray[i];
            aux[index]++;

        }

        int maxFreqCount = getMaxFreqCount(aux);
        return len - maxFreqCount;
    }

    private static int getMaxFreqCount(int[] aux) {
        int maxFreqCount = Integer.MIN_VALUE;
        for (int frequency : aux) {
            if (frequency > maxFreqCount) {
                maxFreqCount = frequency;
            }
        }
        return maxFreqCount;
    }

}
