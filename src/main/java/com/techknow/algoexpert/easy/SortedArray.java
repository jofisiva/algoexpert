package com.techknow.algoexpert.easy;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
       // int array[] = { 1, 2, 3, 4, 5, 6 };
        //int array[] = {11, 15, 66, 75, 5};

        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine().trim();
      String [] inputArray =  inputString.split(", |,");

 int [] array = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

        //{11, 31, 15, 66, 75, 5, 55, 34};
         System.out.println(partialSort(array));
        // System.out.println(partialSort(inputArray));
    }

    static int partialSort(int[] array) {
        int counter = 0;

        int index = 0;
        while (index < array.length - 1) {
            if (counter >= 2) {
                break;
            }
            if (array[index] > array[index + 1]) {
                int temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;

                counter++;
            }
            index++;
        }

        return counter;
    }
}
