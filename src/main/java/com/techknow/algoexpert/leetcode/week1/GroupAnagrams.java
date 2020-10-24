package com.techknow.algoexpert.leetcode.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public static void main(String[] args) {

        String values[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        groupOfAnagrams(values);
    }

    static List<List<String>> groupOfAnagrams(String[] values) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String value : values) {
            char[] chars = value.toCharArray();

            Arrays.sort(chars);

            String key = Arrays.toString(chars);
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                List<String> attributes = new ArrayList<>();
                attributes.add(value);
                map.put(key, attributes);
            }
        }

        map.values().forEach(a -> {
            a.forEach(b -> {
                System.out.print(b + " ");
            });
            System.out.println();
        });
        return map.values().stream().collect(Collectors.toList());

    }
}
