package com.techknow.algoexpert.hackerrank.assestment;

import java.math.BigInteger;

public class Perumation {
    public static void main(String[] args) {

      System.out.println(calculateper(750,466));
    }

    static BigInteger calculateper(int n, int r) {
         final int MOD = (int) 1e9 + 9;
        if(n<r) return BigInteger.ZERO;

        BigInteger num = factorial(n);
        BigInteger sub = factorial(n-r);

        return (num.divide(sub)).divide(new BigInteger(String.valueOf(MOD)));
    }

    private static BigInteger factorial(int n) {

       // return (n > 1) ? n * factorial(n - 1) : 1;
        BigInteger fact= BigInteger.ONE;
        int factorialNo = n;
        final int MOD = (int) 1e9 + 9;
        for (int i = 2; i <= factorialNo; i++)
        {
            fact = fact.multiply(new BigInteger(String.valueOf(i)));
        }

        System.out.println("The factorial of " + factorialNo +" is: " + fact);
        return fact.divide(new BigInteger(String.valueOf(MOD)));
    }
}
