package com.techknow.algoexpert.easy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 */
public class Armstrong {

    public static void main(String[] args) {
       /* System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);

        System.out.println(validArmStrong(Integer.parseInt(scanner.nextLine())));
        System.out.println("Enter the UserName");
        System.out.println(scanner.nextLine());*/
     /* Scanner s = new Scanner(System.in);
        int counter = s.nextInt();

        s = new Scanner(System.in);
        String dollsString = s.nextLine();
        String [] dollsStringArray =dollsString.split(",");
        int [] dolls = Arrays.stream(dollsStringArray).mapToInt(Integer::parseInt).toArray();

        s= new Scanner(System.in);
        String heightsString = s.nextLine();
        String [] heightsStringArray =heightsString.split(",");

        int [] heights=  Arrays.stream(heightsStringArray).mapToInt(Integer::parseInt).toArray();

      int [] output=  operation(dolls,heights);

     String outPutString= Arrays.stream(output).mapToObj(Integer::toString).collect(Collectors.joining(","));
        System.out.println(outPutString);
*/
        Scanner s = new Scanner(System.in);
        int counter = s.nextInt();
        int [] dolls = new int[counter];
        System.out.println("Enter the doll");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine())
        {

            String dollsString = sc.nextLine();
            String [] dollsStringArray =dollsString.split(",");
            dolls = Arrays.stream(dollsStringArray).mapToInt(Integer::parseInt).toArray();
            break;
        }
        int [] heights = new int[counter];
        Scanner sc1= new Scanner(System.in);
        while(sc1.hasNextLine()) {
            String heightsString = sc1.nextLine();
            String [] heightsStringArray =heightsString.split(",");

            heights=  Arrays.stream(heightsStringArray).mapToInt(Integer::parseInt).toArray();
            break;
        }
        int [] output=  operation(dolls,heights);

        String outPutString= Arrays.stream(output).mapToObj(Integer::toString).collect(Collectors.joining(","));
         System.out.println(outPutString);
    }

    public static int [] operation(int [] dolls, int [] heights) {
        //Arrays.sort(heights);
     /*   HashMap<Integer, Integer>  index = new HashMap<Integer, Integer>();
        for(int i=0;i<heights.length;i++) {
            if(heights[i]>heights[i+1]) {
                int temp = heights[i+1];
                heights[i+1] = heights[i];
                heights[i+1] = temp;

            }*/
     int result[] = new int[heights.length];
        for(int i=0;i<heights.length;i++) {
            result[i] = heights[i]+dolls[i];
        }
        Arrays.sort(result);
        Arrays.sort(heights);
       for (int i=0;i<result.length;i++) {
            result[i] = result[i]-heights[i];
        }
return result;
    }

    public static boolean validArmStrong(int number) {
    /*
    121 = %10 =1
    /10
     */

        int total = 0;
        int value = number;
        while (value > 0) {

            int lastNum = value % 10;

            value = value / 10;
            total += (lastNum * lastNum * lastNum);
        }
        return number == total
               ? true
               : false;

    }
}
