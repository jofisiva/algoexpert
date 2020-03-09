package com.techknow.algoexpert.medium;

public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[] {7,6,4,3,1}));
        System.out.println(maxProfit1(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit1(new int[] {7,6,4,3,1}));
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
            if (prices.length==0) return 0;

            int maxProfit = 0;

            int curMin = prices[0];

            for (int i=1;i<prices.length;i++) {

                maxProfit = maxProfit > prices[i]-curMin ? maxProfit: prices[i]-curMin;
                curMin = curMin > prices[i]? prices[i]:curMin;
            }
            return maxProfit;

    }


}
