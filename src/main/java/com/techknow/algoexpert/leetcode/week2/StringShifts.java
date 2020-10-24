package com.techknow.algoexpert.leetcode.week2;

public class StringShifts {



    public static void main(String[] args) {

       String s= "abc";

        int [] [] shift ={{0,1},
                {1,2}};
        System.out.println(stringShift(s, shift));

         s= "abcdefg";
            int [][] shift1 = {
                    {1,1},
                    {1,1},
                    {0,2},
                    {1,3}
            };
        System.out.println(stringShift(s, shift1));

         s= "wpdhhcj";
        int [][] shift2 =  {   {0,7},{1,7},{1,0},{1,3},{0,3},{0,6},{1,2}};
        System.out.println(stringShift(s, shift2));
/*
cab
efgabcd
hcjwpdh
 */
        s ="xqgwkiqpif" ;

        int [][] shift3 = {{1,4},{0,7},{0,8},{0,7},{0,6},{1,3},{0,1},{1,7},{0,5},{0,6}};
        System.out.println(stringShift(s, shift3));
    }


   static String  stringShift(String s, int[][] shift) {

        if(s.length() <=1) {
            return s;
        }
        int leftshift =0;
        int rightshift =0;

String result="";
        for (int i = 0; i<shift.length; i++) {

            if (shift[i][0] == 0) {
                leftshift += shift[i][1];
            } else {
                rightshift += shift[i][1];
            }

        }
        if(leftshift > rightshift) {
            leftshift -=rightshift;
            leftshift %= s.length();
            result += s.substring(leftshift);
            result += s.substring(0, leftshift);

        }else  {

            rightshift-= leftshift;
            rightshift%= s.length();

            result += s.substring(s.length()- rightshift);

           result += s.substring(0, s.length()-rightshift);

        }

        return result;

   }
}
