package com.techknow.algoexpert.medium;

public class CoinChange {
    public static void main(String[] args) {
       System.out.println(numberWaysOfChange(30, new int[] {1,5,10,25}));
    }


    public   static  int numberWaysOfChange(int n, int [] denoms) {

        int ways[] = new int[n+1];
        ways[0] = 1;

        for(int value :denoms) {

            for(int amount =1; amount < n+1 ; amount++) {
                if(value<=amount) {
                    ways[amount] = ways[amount] + ways[amount-value];
                }
            }
        }
        return ways[n];
    }
}
