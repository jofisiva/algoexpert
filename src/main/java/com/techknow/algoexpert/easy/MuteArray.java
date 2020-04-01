package com.techknow.algoexpert.easy;

public class MuteArray {
    public static void main(String[] args) {

       /* int[] output = muteArray(5, new int[] { 4, 0, 1, -2, 3 });
        for (int value : output) {
            System.out.println(value);
        }*/
       //1,4,5,6,3-->1,3,4,6,5
System.out.println(Math.min(-1,0));
        System.out.println(alternatingSort(new int[]{1,3,5,6,4,2}));//1,2,3,4,5,6
    }

    public static int[] muteArray(int n, int[] a) {

        int[] result = new int[n];
        for (int i = 0; i < a.length; i++) {
            if (i - 1 < 0) {
                //a[i - 1] = 0;
                result[i] = 0 + a[i] + a[i + 1];
            } else if (i + 1 >= n) {
                //a[i+1] =0;
                result[i] = a[i - 1] + a[i] + 0;
            } else {

                //if(i<n) {
                result[i] = a[i - 1] + a[i] + a[i + 1];
            }
            // }
        }
        return result;
    }
    static boolean alternatingSort(int[] a) {
        int b[] = new int[a.length];
        b[0]= a[0];
        b[1] = a[a.length-1];
        b[2]= a[1];
        int counter =3;
        for(int i=3;i<a.length-1;i++) {
            b[i] = a[i-1]-a[a.length-1];
            counter++;
        }

        for(int i=1;i<b.length-1;i++) {
            if(b[i-1]>b[i]) {
                return false;
            }
        }
        return false;
    }

}
