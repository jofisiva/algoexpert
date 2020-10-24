package com.techknow.algoexpert.hackerrank.string;

public class SubstrCount {
    public static void main(String[] args) {

        String input = "mnonopoo";
        System.out.println(specialSubstrCount(input));

    }

    private static int specialSubstrCount(String input) {
        int ans = input.length();

        for(int i = 0; i < input.length(); i++) {

            int repeat = 0;
            while (i+1<input.length() && input.charAt(i+1) == input.charAt(i)) {
                i++;
                repeat++;

            }

            ans += (repeat* (repeat+1))/2;

            int pointer =1;
            while(i-pointer>=0 && i+pointer<input.length() && input.charAt(i+pointer) == input.charAt(i-1) &&
                    input.charAt(i-pointer)== input.charAt(i-1)) {
                ans++;
                pointer++;
            }
        }


        return ans;

    }

}
