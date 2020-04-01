package com.techknow.algoexpert.medium;

public class StringOfString {
    public static void main(String[] args) {
        System.out.println(substring("CodefightsAwesomeIs", "IsA"));
       // System.out.println(substring("CodefightsIsAwesome", "IA"));
        //System.out.println(substring("ffbefbdbacbccecaceddcbcaeaebfedfcfdbeecffdbbf", "cb"));
        //System.out.println(substring("sst", "st"));
    }

    private static int substring(String str1, String str2) {

        if(str1.length()==0 || str2.length()==0) {
            return -1;
        }
        if(str1.length()==1 || str2.length()==1) {
            if(str1.equals(str2)) return 1;
            else
                return -1;
        }
        int firstStringLength = str1.length();
        int secondStringLength = str2.length();

        for (int i = 0; i <= firstStringLength - secondStringLength; i++) {
            int j;
System.out.println(i+","+firstStringLength+","+ secondStringLength);
            for (j = 0; j < secondStringLength; j++)
                if (str1.charAt(i + j) != str2.charAt(j))
                    break;

            if (j == secondStringLength)
                return i;
        }

        return -1;
    }
}