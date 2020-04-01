package com.techknow.algoexpert.easy;

import java.util.ArrayList;
import java.util.List;

public class MediumArray {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] inputString = input.split(":");
      String [] inputArray= inputString[0].split(",");
        int [] array = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
        int startIndex = Integer.parseInt(inputString[1]);*/

        System.out.println(numberofStepss(new int[] { 2, 4, 1, 0, 5, 3 }, 0)); //5
        //  System.out.println(numberofStepss(array, startIndex));
    }

    static int numberofStepss(int[] arr, int startIndex) {

        if (arr.length == 1) {
            return arr[0];
        }

      /*  int left = 0;
        int right = 0;
        int n = arr.length - 1;
        int counter = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        while (left < n) {

            int nextIndex = arr[left];
            if (!hs.contains(arr[nextIndex])) {
                hs.add(-(arr[left]));
                left++;
                counter++;
            }


        }
        if (counter == arr.length-1) {
            return counter;
        }*/



         int counter = 0;
        int n = arr.length;
         int startValue = arr[startIndex];
         int start = startValue;
      List<Integer> hs = new ArrayList<Integer>();
       // for (int i = startIndex; i <arr.length; i++) {

        while(counter<n) {
            int nextIndex = arr[start];
            if(nextIndex == startValue) {
                return counter;
            }else {
                counter++;
                start = nextIndex;

            }
           /* if (!hs.contains(arr[nextIndex])) {
                hs.add(-(arr[i]));
                counter++;*/
            } /*else {
                return counter;
            }

        //   }*/

        // return counter;

        /*int startValue = arr[startIndex];

        int counter=0;
        int n = arr.length-2;
        while(counter<n) {

            if(arr[startValue]== arr[startIndex]) {
                return counter;
            }else {

            }
            int nextIndex = arr[startValue];

            startValue = nextIndex;
            counter++;

        }*/
        return -1;
    }


}
