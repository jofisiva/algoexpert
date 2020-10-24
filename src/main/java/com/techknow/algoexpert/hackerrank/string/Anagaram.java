package com.techknow.algoexpert.hackerrank.string;

import java.util.Collection;
import java.util.HashMap;

public class Anagaram {

    public static void main(String[] args) {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        System.out.print(makeAnargam(a, b));
    }

    private static int makeAnargam(String a, String b) {

        int deletion = 0;

      /*  if (a.length() != b.length()) {
            return 0;
        }*/
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), Integer.valueOf(map.get(a.charAt(i)) + 1));
            } else {
                map.put(a.charAt(i), 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), Integer.valueOf(map.get(b.charAt(i)) - 1));
            } else {
                map.put(b.charAt(i), -1);
            }
        }

        Collection<Integer> values = map.values();

        for (int value : values) {
            deletion = deletion + Math.abs(value);
        }
        return deletion;
    }

}
