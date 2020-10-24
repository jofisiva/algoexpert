package com.techknow.algoexpert.hackerrank.string;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String[] s1="give me one grand today night".split(" ");
        String[] s2 ="give one grand today".split(" ");

        System.out.println(ransomNote(s1,s2));

    }

    private static boolean ransomNote(String[] magazString, String[] notesString) {
        HashMap<String,Integer> magazine = new HashMap<String,Integer>();
        HashMap<String,Integer> notes = new HashMap<String,Integer>();

        boolean condition = true;
        for(String value : magazString) {

            if (magazine.containsKey(value)) {
                magazine.put(value, magazine.get(value) + 1);
            } else {
                magazine.put(value, 1);
            }
        }


        for(String value : notesString) {

            if (notes.containsKey(value)) {
                notes.put(value, notes.get(value) + 1);
            } else {
                notes.put(value, 1);
            }
        }

        for(String key: notes.keySet())
            if (!magazine.containsKey(key) || magazine.get(key) < notes.get(key)) {
                condition = false;
                break;
            }

        return condition;

    }


}
