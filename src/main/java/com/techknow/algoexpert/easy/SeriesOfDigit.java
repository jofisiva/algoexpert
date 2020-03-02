package com.techknow.algoexpert.easy;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SeriesOfDigit {

    /*
    5
    1*1*1
    2*2*2

     */
    public static void main(String[] args) {

        BigDecimal grandTotal = new BigDecimal(BigInteger.ZERO);

        BigDecimal total = new BigDecimal(BigInteger.ZERO);

        BigDecimal temp = new BigDecimal(BigInteger.ONE);
        int n =5;
        for(int i=1;i<=n;i++) {

             total = temp.pow(i);
             temp = temp.add(BigDecimal.ONE);
            grandTotal = grandTotal.add(total);
        }
        System.out.println(grandTotal);
    }


}
