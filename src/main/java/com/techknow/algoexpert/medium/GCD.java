package com.techknow.algoexpert.medium;

public class GCD {

    public static void main(String[] args) {
       // System.out.println(findGCD(1025, 35));

         int arr[] = { 2,  6, 4, 8, 16 };
         //int arr[] = { 3,  6, 9, 12, 15,1 };
        int n = arr.length;
        System.out.println(findGCDN(arr, n));
    }

    private static int findGCD(int a, int b) {

        /*if (a == 0)
            return b;
        if (b == 0)
            return a;*/

        return b==0 ? a : findGCD(b, a%b);
       // return findGCD(b, a % b);

    }
    static int itervativeGCD(int a ,int b) {

        while(b!=0) {

            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
static  int binaryGCD(int a, int b) {
    if (b == 0)
        return a;
    int commonMultiple2;

    return a;

}
    static int findGCDN(int arr[], int n) {

        int temp = arr[0];

        for (int i = 1; i < n; i++) {

            temp = itervativeGCD(temp, arr[i]);
            if (temp == 1) {
                return temp;
            }
        }
        return temp;
    }
}
