package com.techknow.algoexpert.medium;

import java.util.Arrays;
import java.util.List;

public class MaxProfit {
    public static void main(String[] args) {
        /*System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[] {7,6,4,3,1}));
        System.out.println(maxProfit1(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit1(new int[] {7,6,4,3,1}));*/
        System.out.println(maxProfit2(new int[] {100, 180, 260, 310, 40, 535, 695}));
    }

    public static int maxProfit(int [] prices) {

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
/*
maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(
 */
    public static int maxProfit1(int [] prices) {

        List<int[]> numbers = Arrays.asList(prices);
            if (prices.length==0) return 0;

            int maxProfit = 0;

            int curMin = prices[0];

            for (int i=1;i<prices.length;i++) {

                maxProfit = Math.max(maxProfit, prices[i] - curMin);
                curMin = Math.min(curMin, prices[i]);

            }
            return maxProfit;

    }

public static int maxProfit2(int [] prices) {
  //  100 180 260 310 40 535 695
        if(prices.length==0) return 0;
         int maxProfit =0;
         int curMin = prices[0];

         for (int i = 1; i < prices.length;i++) {

             maxProfit = Math.max(maxProfit, prices[i] - curMin);
             curMin = Math.min(curMin, prices[i]);
             System.out.println(curMin +","+prices[i]);
         }
         return maxProfit;
}

}
