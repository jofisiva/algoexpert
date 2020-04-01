package com.techknow.algoexpert.easy;

import java.util.HashMap;

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(firstNotRepeatingCharacter("abacabad"));
    }

    static char firstNotRepeatingCharacter(String s) {
        HashMap<Character, Integer> repeat = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            Character value = s.charAt(i);
            if (repeat.containsKey(value)) {

                int nexxt = repeat.get(value);
                repeat.put(value, nexxt + 1);

            } else {
                repeat.put(value, 1);

            }

        }

        for (int i = 0; i <=s.length(); i++) {

            if (repeat.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }

        return '-';
    }
}
