package com.techknow.algoexpert.leetcode.week2;

import java.util.Stack;

public class BackSpaceCompare {
    public static void main(String[] args) {
        System.out.println(backSpaceCompare("a##c", "#a#c"));
    }

    public static boolean backSpaceCompare(String s1, String s2) {
        Stack<Character> sStack = getCharacters(s1);
        Stack<Character> tStack = getCharacters(s2);

        while(!sStack.isEmpty())  {

            char c = sStack.pop();

            if(tStack.isEmpty() || c!= tStack.pop()) {
                return false;
            }


        }

        return sStack.isEmpty() && tStack.isEmpty();
    }

    private static Stack<Character> getCharacters(String s1) {
        Stack<Character> sStack = new Stack();
        for (char c : s1.toCharArray()) {
            if (c != '#') {
                sStack.push(c);
            } else if(!sStack.isEmpty()) {
                sStack.pop();
            }

        }
        return sStack;
    }
}
