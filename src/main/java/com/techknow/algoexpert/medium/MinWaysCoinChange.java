package com.techknow.algoexpert.medium;

import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;

public class MinWaysCoinChange {
    public static void main(String[] args) {

       // System.out.println(minimumCoinChangedp(10, new int[] { 1, 5, 6, 9 }));
        System.out.println(minimumCoinChange(10, new int[] { 1, 5, 6, 9 }));
    }

    private static int minimumCoinChange(int n, int[] denoms) {
        int[] numberofcoins = new int[n + 1];
        Arrays.fill(numberofcoins, MAX_VALUE);

        numberofcoins[0] = 0;
        int toCompare =0;
        for (int denom : denoms) {

            for (int amount = 0; amount < numberofcoins.length; amount++) {

                if (denom <= amount) {
                    if(numberofcoins[amount-denom] == MAX_VALUE) {
                        toCompare = numberofcoins[amount-denom];
                    }else {
                        toCompare = numberofcoins[amount-denom]+1;
                    }
                    numberofcoins[amount] = Math.min(numberofcoins[amount], toCompare);
                }

            }

        }
        return numberofcoins[n] != MAX_VALUE
               ? numberofcoins[n]
               : -1;

    }

    private static int minimumCoinChangedp(int amount, int[] coins) {

        int a[][] = new int[coins.length+1][amount + 1];
        for(int j=0;j<=amount;j++) {
            a[0][j]=MAX_VALUE;
        }
        for (int i = 1; i <=coins.length; i++) {
            a[i][0] = 0;
        }

        for (int i = 1; i <= coins.length; i++) {

            for (int j = 1; j <= amount; j++) {

                if (coins[i-1] <=j) {

                    a[i][j] = Math.min(a[i - 1][j], 1 + a[i][j - coins[i-1]]);
                } else {

                    a[i][j] = a[i - 1][j];
                }
            }
        }
       return a[coins.length][amount];
    }
}
