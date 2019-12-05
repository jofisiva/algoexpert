package com.techknow.algoexpert.easy;

public class FindThreeLargestNumber {

    public static void main(String args[]) {

        int[] initalArray = new int[] {-2, -1, 7};
        int[] resultArray = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int i = 0; i < initalArray.length; i++) {
            FindThreeLargestNumber.findThreeLargestnumber(initalArray[i], resultArray);
        }
        System.out.println(resultArray[0]);
        System.out.println(resultArray[1]);
        System.out.println(resultArray[2]);

    }

    static void findThreeLargestnumber(int num, int[] resultArray) {

        if (num > resultArray[2]) {

            shiftAndUpdate(resultArray, num, 2);
        } else if (num > resultArray[1]) {
            shiftAndUpdate(resultArray, num, 1);
        } else if (num > resultArray[0]) {
            shiftAndUpdate(resultArray, num, 0);
        }
    }

    static void shiftAndUpdate(int[] array, int num, int index) {
        int i = 0;
        while (i <= index) {

            if (i == index) {

                array[i] = num;

            } else {
                array[i] = array[i + 1];
            }
            i++;
        }

    }
}
