package com.techknow.algoexpert.hackerrank.string;

import java.util.HashSet;

public class TwoStrings {

    public static void main(String[] args) {
        String s1 = "SHINCHAN";
        String s2 = "NOHARAAA";
        System.out.println(isTwoStrings(s1, s2));
    }

    static boolean isTwoStrings(String s1, String s2) {

        HashSet<Character> hs = new HashSet<Character>();
        HashSet<Character> hs2 = new HashSet<Character>();

        for (int i = 0; i < s1.length(); i++) {
            hs.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            hs2.add(s2.charAt(i));
        }

        hs.retainAll(hs2);
        if (!hs.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
