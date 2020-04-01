package com.techknow.algoexpert.medium;

public class SteppingNumber {

    public static void main(String[] args) {
        int n = 124;
        int m = 200;

        for (int i = n; i <= m; i++) {
            if (isSteppingNumber(i)) {
                System.out.print(i + " ");
            }
        }

    }

    static boolean isSteppingNumber(int number) {
        boolean result = true;
       /* int temp_no = number;
        int digits = 0;
        while (temp_no > 0) {
            digits++;
            temp_no = temp_no / 10;
        }*/
        int prev_digits = -1;

        int temp = number;
        while (temp > 0) {

            int currentDigits = temp % 10;
            if (prev_digits != -1) {

                //  int difference = Math.abs(currentDigits-prev_digits;
                if (Math.abs(currentDigits - prev_digits) != 1) {
                    result = false;
                }
                //                }else {
                //                    differenceCount++;
                //                }
            }
            temp = temp / 10;
            prev_digits = currentDigits;

        }

       /* if (result) {
            System.out.println("The stepping number" + number);
        } else {
            System.out.println("Not The stepping number" + number);
        }*/
        return result;
       /* if(differenceCount == (digits-1)) {
            System.out.println("The stepping number" + number);
        }else {
            System.out.println("Not The stepping number" + number);
        }*/
    }
}
