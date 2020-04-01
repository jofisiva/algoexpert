package com.techknow.algoexpert.easy;

import java.util.Scanner;

public class PronicNumber {
    public static void main(String[] args) {
        System.out.println("Enter input number ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int sqrtNum = (int) Math.sqrt(inputNumber);
        int product = sqrtNum * (sqrtNum + 1);
        if (product == inputNumber)
            System.out.println("Pronic Number");
        else
            System.out.println("Not a Pronic Number");

    }
}
