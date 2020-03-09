package com.techknow.algoexpert.easy;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        String s = "geeksforgeeks";

        System.out.println(unique(s));
    }

    public static String unique(String value) {

        String result ="";

        char[] arr = value.toCharArray();

        for(int i=0 ;i<arr.length ; i++) {
            if(result.indexOf(arr[i])<0) {
                result = result+arr[i];
            }
        }
        return result;

    }
}
