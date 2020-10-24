package com.techknow.algoexpert.hackerrank.array;

public class JumpingClouds {
    public static void main(String[] args) {

        int clouds[] = {0,0,1,1,1,1,0};
        jumpingClouds( clouds );
    }

    private static void jumpingClouds(int[] clouds) {

        int count = -1;
        int num = clouds.length;
      for(int i = 0; i < num; i++, count++ ) {

            if(i+2<num && clouds[i+2]==0) {
                i++;
            }

        }

        System.out.println(count);
    }
}

