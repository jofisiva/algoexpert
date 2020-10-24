package com.techknow.algoexpert.Java;

public class StringReverse {

    // Constructure for StringReverse.
    public StringReverse() {
    }

    // method contains code to revese a provided string in parameter.
    private String reverse(String str) {
        // Return blank if string is null.
        if(str == null)
            return "";
        // Create a new StringBuffer object, easy to append.
        StringBuffer buffer = new StringBuffer();
        int length = str.length();
        // Create a loop from the last position of str to start position.
        for(int count = length-1; count >= 0; count--) {
            // append each character in buffer object.
            buffer.append(str.charAt(count));
        }
        // convert buffer to String and return.
        return buffer.toString();
    }

    public static void main(String[] args) {
        // String that needs to be reverse.
        String str = "Wow! What a nice weather.";
        StringReverse obj = new StringReverse();
        // Call reverse method to get reversed string.
        System.out.println(obj.reverse(str));
    }
}


