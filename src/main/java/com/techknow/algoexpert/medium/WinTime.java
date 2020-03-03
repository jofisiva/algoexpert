package com.techknow.algoexpert.medium;

public class WinTime {
    public static void main(String[] args) {
        System.out.println(canWinNim(3));
    }

    public static boolean canWinNim(int n) {

        boolean player1 = true;
        boolean player2 = true;

        int [] heap = new int[n];

        for (int i=0 ;i<n; i++) {

            if(player1) {

                heap[i]= 1;
                player1 = false;
            }else {
                heap[i] =2;
                player2= false;
            }

        }
        return player1 ? true : false;

    }
}
