package com.techknow.algoexpert.hackerrank.array;

import java.util.Arrays;

public class NewYearChaos {
   static int swapcount = 0;
    public static void main(String[] args) {

        int array[] = {1,2, 5, 3, 7, 8, 6, 4};


        minimumBribes(array);
        Arrays.stream(array).forEach(System.out::println);
        System.out.println(swapcount);
    }
    static void minimumBribes(int[] arr) {
int nums = arr.length;

for(int i= nums-1; i>=0;i--) {

    if(arr[i]!=i+1) {

        if(((i-1)>=0) && arr[i-1]==(i+1)) {
            swapcount++;
            swap(arr,i-1,i);
        }else if ( ((i-2)>=0) && arr[i-2]==(i+1)) {
            swapcount +=2;
            swap(arr,i-2,i-1);

            swap(arr,i-1,i);

        }else  {
            System.out.println("Too chaotic");
            return;
        }

    }


}

    }

    private static void swap(int[] arr, int a, int b) {

        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
