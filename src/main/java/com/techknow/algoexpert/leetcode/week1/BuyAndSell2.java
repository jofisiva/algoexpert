package com.techknow.algoexpert.leetcode.week1;

public class BuyAndSell2 {

    public static void main(String[] args) {

        int array[] ={7,1,5,3,6,4};
        System.out.println(maxProfit(array));

    }

static int maxProfit(int [] prices) {
int maxProfit =0;
if(prices==null || prices.length==0) {
    return 0;
}

for(int i=0;i<prices.length-1;i++) {
    if(prices[i+1] > prices[i]) {
        maxProfit = maxProfit+(prices[i+1]-prices[i]);
    }
}

return maxProfit;
}
}
