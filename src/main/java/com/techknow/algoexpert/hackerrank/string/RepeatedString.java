package com.techknow.algoexpert.hackerrank.string;

public class RepeatedString {

    public static void main(String[] args) {
        String s = "abc";
        int n = 10;
        System.out.println(repeatedString(s, n));
    }

    private static long repeatedString(String string, int occurrences) {
        int n = string.length();
        long q = occurrences / n;
        long r = occurrences % n;

        long partialIndex = (r == 0)
                           ? 0
                           : r;
        long lengthOfA = (q * strlength(string, n)) + strlength(string, partialIndex);
        return lengthOfA;

    }

    private static int strlength(String string, long length) {

        //        char[] stringArray =string.toCharArray();
        //       Map<Character,Long> characterLongMap = Arrays.asList(stringArray).stream()
        //               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int count = 0;

        for (int i = 0; i < length; i++) {
            if (string.charAt(i) == 'a') {
                count++;
            }
        }
        return count;

    }

}

