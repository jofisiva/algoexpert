package com.techknow.algoexpert.easy;

public class Lcd {

    public static void main(String[] args) {
        System.out.println(findLCM(15,20));
    }
    static int findLCM(int a, int b) {

        int result = (a*b)*gcd(a,b);
        return result;
    }
    static int gcd(int a, int b) {

        if(b==0) return a;
       return gcd(b, a%b);
    }
}
