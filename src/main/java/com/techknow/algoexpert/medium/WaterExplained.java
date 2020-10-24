package com.techknow.algoexpert.medium;

public class WaterExplained {

    public static void main(String[] args) {
        int array[] = {1,8,6,2,5,4,8,3,7};
System.out.println(maxWaterStorage(array));
    }

    public static int maxWaterStorage(int [] array) {
        int maxLength =0;
        int leftPointer =0;
        int rightPointer =array.length-1;

        while(leftPointer <rightPointer) {

            if(array[leftPointer]<array[rightPointer]) {
                maxLength = Math.max(maxLength, (array[leftPointer] * (rightPointer-leftPointer)));
                leftPointer++;
            }else {
                maxLength = Math.max(maxLength, (array[rightPointer] * (rightPointer-leftPointer)));
                rightPointer--;
            }
        }

        return maxLength;

    }
}
