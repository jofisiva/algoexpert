package com.techknow.algoexpert.easy;

public class PrefixAndSuffix {
    //aabcdaabc

    public static void main(String[] args) {

        String value = "abcacab";
        System.out.println(PrefixAndSuffix.longestPrefixAndSuffix(value));

    }

    static int longestPrefixAndSuffix(String value) {

        int longest = 0;
       // int left = 0;
        int right = value.length();
        int n =  right/2;

        if(value.length()<2) {
            return longest;
        }
        while(n < right) {

            if(value.charAt(n)== value.charAt(longest)) {
                n++;
                longest++;
                System.out.println("same-->" + value.substring(longest,n));
            }else if(longest==0){
               n++;

                System.out.println("elseif -->" + value.substring(longest,n));
            }else {
                longest--;
                System.out.println("else -->" + value.substring(longest,n));
            }
        }
        return longest;
    }
}
