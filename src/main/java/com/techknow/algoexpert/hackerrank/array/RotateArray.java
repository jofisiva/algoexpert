package com.techknow.algoexpert.hackerrank.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        //5-2 =3
        int[] array = { 1,2,3,4,5 };
//5 1 2 3 4

        int n = array.length;
        // int [] result =  rot_array(array, n, 2);
        int k = 4;
      //  k= k%array.length;
       // reverse(array, 0, (n - k)-1 );
       // reverse(array, n-k, n-1 );
       // reverse(array, 0, n-1 );
        rotate( array, 2);
        Arrays.stream(array, 0, n).forEach(System.out::println);
    }

    static int[] rot_array(int[] array, int n, int k) {
        int[] rot_array = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - k) % n;
             rot_array[newIndex] = array[i];
        }

        return rot_array;
    }

    static void rotate(int[] array, int k) {
        int i=1;
        while (i<=k) {
            for (int j= 0; i < array.length; j++) {
                reverse(array, i, array.length);

            }

            i++;
        }
    }


    static void reverse(int[] array, int start, int end) {

        while (start <= end) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
