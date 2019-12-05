package com.techknow.algoexpert.easy;

public class Palindrome {

    public static void main(String[] args) {
        String value = "a";
        System.out.println(Palindrome.palindromeString(value));
    }

    public static boolean palindromeString(String value) {
        char[] arrayString = value.toCharArray();
        /*StringBuffer stringBuffer = new StringBuffer(value);
       return value.equals(stringBuffer.reverse().toString());*/

      /*  String result = new String();

      for(int i = value.length()-1;i>=0; i--){

          result = result.concat(String.valueOf(arrayString[i]));
      }
        return value.equals(result);*/

        int leftPointer = 0;
        int rightPointer = value.length() - 1;

        while (leftPointer < rightPointer) {

            if (value.charAt(leftPointer) != value.charAt(rightPointer)) {

                return false;
            }
            leftPointer++;
            rightPointer--;

        }

        return false;
    }

}
