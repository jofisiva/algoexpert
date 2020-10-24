package com.techknow.algoexpert.hackerrank.string;

public class AlternatingCharacters {
    public static void main(String[] args) {
        String a ="AAAA";
        System.out.println(alternatingCharacters(a));
    }

    private static int alternatingCharacters(String a) {

        int deleteCount = 0;

        if (a.length()==0) {
            return deleteCount;
        }
        int limit = a.length();
        for (int i = 0; i < a.length(); i++) {
            int value = i;
            if( value +1 <limit && a.charAt(i) == a.charAt(i+1)) {
                deleteCount++;
            }
        }


        return deleteCount;
    }
}
