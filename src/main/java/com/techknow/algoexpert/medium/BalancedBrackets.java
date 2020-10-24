package com.techknow.algoexpert.medium;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        String value = "([])(){}(())()()";
        System.out.println(isBalanced(value));


    }
    static boolean isBalanced(String s) {
        //(, ), {, }, [, or ]
        Stack<Character> stack= new Stack<Character>();

        for(int i=0; i<s.length();i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }else {
                    char pop_value = stack.pop();

                    if(s.charAt(i)==')' && pop_value!='(') {
                        return false;
                    }
                    if(s.charAt(i)=='}' && pop_value!='{') {
                        return false;
                    }
                    if(s.charAt(i)==']' && pop_value!='[') {
                        return false;
                    }

                }

            }
        }
        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }

    }
    static String isBalancedr(String s) {
//(, ), {, }, [, or ]
        Stack<Character> stack= new Stack<Character>();

for(int i=0; i<s.length();i++) {
    if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
        stack.push(s.charAt(i));
    }
    else {
        if(stack.isEmpty()) {
            return "NO";
        }else {
            char pop_value = stack.pop();

            if(s.charAt(i)==')' && pop_value!='(') {
                return "NO";
            }
            if(s.charAt(i)=='}' && pop_value!='{') {
                return "NO";
            }
            if(s.charAt(i)==']' && pop_value!='[') {
                return "NO";
            }

        }

    }
}
        if(stack.isEmpty()) {
            return "YES";
        }else {
            return "NO";
        }

    }
}
