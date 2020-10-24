package com.techknow.algoexpert.hackerrank.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SherlockAndAnagrams {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String valueString = input.next();

        int result = sherlockAndAnagrams(valueString);
        System.out.println(result);

    }

    private static int sherlockAndAnagrams(String valueString) {
        int anagarams = 0;

        HashMap<String,Integer> hashmap= new HashMap<String,Integer>();

        for(int i=0;i<valueString.length(); i++) {

            for(int j=i;j<valueString.length(); j++) {

                char c[]=valueString.substring(i,j+1).toCharArray();
                Arrays.sort(c);
                String value = new String(c);

                if(hashmap.containsKey(value)) {
                   hashmap.put(value, hashmap.get(value)+1);
                }else {
                    hashmap.put(value,1);
                }

            }
        }

        for(String key : hashmap.keySet()) {
            int v=hashmap.get(key);
            if(v>=2) {
                anagarams+=1;
            }
            //anagarams += (v*(v-1))/2;
        }

        return anagarams;
    }
}
