package com.techknow.algoexpert.easy;

public class BubbleSort {

    public static void main(String args[]) {

       // int array[] = { 8, 5, 2, 9, 5, 6, 1 };
        /*45 23 76 96
        24 73 15 8 84*/

        int array[] = { 45,23,76,96 };
        BubbleSort.sort1(array);
        for (int value : array) {
            System.out.print(value);
                System.out.print(" ");
        }

        /*for (int value : array) {
            System.out.print(value);
        }
        System.out.println("---");
        BubbleSort.bubbleSort(array);
        for (int value : arr    ay) {
            System.out.print(value);
        }*/
    }

    private static void sort1(int [] array) {
        int counter =0;
        boolean isSorted =false;

        while(!isSorted) {
            isSorted =true;
            for(int i=0; i<array.length-1-counter; i++) {
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted =false;
                }

            }
            counter++;

        }
    }

        public static void bubbleSort(int [] array) {
    boolean  sort = false;
            for (int i=0 ;i<array.length-1; i++) {
                sort = false;
                for(int j=0;j<array.length-1-i; j++) {
                       System.out.println("Swap of "+ i + j);
                    if(array[j]>array[j+1]) {
                        int temp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = temp;
                        sort = true;
                    }

                }
                if(sort==false) {break;}
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
