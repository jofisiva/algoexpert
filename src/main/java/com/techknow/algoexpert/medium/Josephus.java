package com.techknow.algoexpert.medium;

public class Josephus {
    public static void main(String[] args) {
System.out.println(josephus(7,3));
    }
    static int josephus(int n, int k) {
        if(n==1) return 1;
else
    return (josephus(n-1,k)+k-1) %n+1;

    }
}
