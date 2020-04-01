package com.techknow.algoexpert.easy;

import java.util.Scanner;

public class AddingFraction {
    public static void main(String[] args) {
        add(1, 2, 3, 2);
        add(1, 3, 3, 9);
        add(1, 5, 3, 15);
        Scanner sc = new Scanner(System.in);;

    }

    static void add(int nom1, int denom1, int nom2, int denom2) {

        int comd = denom1 * denom2; //creates common denominator by multiplying both denominators
       int  answer = (comd/denom1 * nom1) + (comd/denom2 * nom2);
        int newNomAnswer = nom1 * denom2 + nom2 * denom1;
int result=Math.max(denom1,denom2);
        int a =(newNomAnswer/result);
       int b= (comd/result);

        System.out.println(nom1 + "/" + denom1 + " + " + nom2 + "/" + denom2 + " = " + newNomAnswer + "/" + comd + " = " +  a + "/" + b +" = " +  answer + "/" + comd);

    }
}
