package com.techknow.algoexpert.medium;

import java.util.Collections;
import java.util.List;

public class CoinChange {
    public static void main(String[] args) {
        // System.out.println(numberWaysOfChange(30, new int[] {1,5,10,25}));
       /* List<Integer> ways = new ArrayList<>();
        ways = coinChange(6, Arrays.stream(new int[] { 1,5}).boxed().collect(Collectors.toList()), ways);
        ways.forEach(System.out::println);*/

        System.out.println();
        System.out.println(numberWaysOfChangedp(30, new int[] {1,5,10,25}));
        System.out.println(numberWaysOfChangedp(27, new int[] {1,5,10,25}));
    }


    public static int numberWaysOfChangedp(int n, int [] denoms) {

        int ways[] = new int[n+1];

        ways[0]=1;

        for(int denom : denoms) {

            for(int amount=1; amount<ways.length; amount++) {
                if(denom<=amount) {
                    ways[amount]+= ways[amount-denom];
                }
            }
        }

        return ways[n];
    }
    public static int numberWaysOfChange(int n, int[] denoms) {

        int ways[] = new int[n+1];
        ways[0] = 1;

        for (int denom : denoms) {

            for (int amount = 1; amount < ways.length; amount++) {
                if (denom <= amount) {
                    ways[amount] = ways[amount] + ways[amount - denom];
                    System.out.println(ways[amount]);
                }
            }
        }

        return ways[n];
    }

    public static List<Integer> coinChange(Integer amount,  List<Integer> coinsList, List<Integer> ways) {
        Collections.sort(coinsList);
        int remainig=0;

        if(amount ==0 ) {
            return ways;
        }
        Integer coinchoosen = 0;

        if (coinsList.contains(amount)) {

            ways.add(amount);

            return ways;
        }

        for (int i = 0; i < coinsList.size(); i++) {
            if (coinsList.get(i) < amount) {
                coinchoosen = coinsList.get(i);
            } else {
                break;
            }

        }
         remainig = amount - coinchoosen;
        coinsList.remove(coinchoosen);
        ways.add(coinchoosen);
        coinChange(remainig, coinsList,ways);
        return ways;

    }
}
