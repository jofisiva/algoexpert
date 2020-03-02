package com.techknow.algoexpert.medium;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
System.out.println("Enter the number");
System.out.println(sumOfTotal(number));


    }

    static BigDecimal sumOfTotal(int seriesNumber) {

        BigDecimal total = new BigDecimal(BigInteger.ZERO);
        BigDecimal temp = new BigDecimal(BigInteger.ONE);
BigDecimal grandTotal = new BigDecimal(BigInteger.ZERO);

        for(int i=1;i<seriesNumber;i++) {

           total = temp.pow(i);
           temp.add(BigDecimal.ONE);
           grandTotal.add(temp);
        }
        return grandTotal;
    }
}
