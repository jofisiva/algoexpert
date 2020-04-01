package com.techknow.algoexpert.medium;

public class AmendTheSentence {

    public static void main(String[] args) {
        String inputString = "CodesignalIsAwesome";
        System.out.println(amendTheSentence(inputString));

        inputString = "Hello";
        System.out.println(amendTheSentence(inputString));
    }

    private static String amendTheSentence(String inputString) {
        return parseSequence(inputString, " ");
    }

    private static String parseSequence(String inputString, String separator) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isUpperCase(inputString.charAt(i))) {
                builder.append(separator);
    }
            builder.append(inputString.charAt(i));

        }
        return builder.toString().toLowerCase().trim();
    }

}
