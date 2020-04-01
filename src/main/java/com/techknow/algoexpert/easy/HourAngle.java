package com.techknow.algoexpert.easy;

import java.util.HashMap;

public class HourAngle {
    public static void main(String[] args) {

      //System.out.println(calculateAngle(3,30));
char[] input = new char[256];
HashMap<Integer,Character> map =new HashMap<Integer,Character>();;
        byte b = 65;
        for (byte i=b; i<=b+25; i++) {
            input[i] = (char)i;
            map.put(Integer.valueOf(i), input[i]);
            System.out.print(i+","+input[i]+" " );
        }
         b = 97;
        int count =91;
        for (byte i=b; i<=b+25; i++) {
            input[count] = (char)i;
            map.put(Integer.valueOf(count), input[count]);
            System.out.print(i+","+input[i]+" " );
            count++;
        }

        String [] stringArray = "Hello World".split(" ");
        for(String value : stringArray) {
            char[] inputArray = value.toCharArray();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < inputArray.length; i++) {
                int result = (int) inputArray[i];
                System.out.println(result);
                if (result <= 90) {
                    int upperindex = result + 4;
                    Character character = map.get(upperindex);
                    String lowerString = character.toString().toLowerCase();
                    builder = builder.append(lowerString);

                } else if (result >= 97) {
                    int lowerindex = result - 4;
                    Character character = map.get(lowerindex);
                    String upperString = character.toString().toUpperCase();
                    builder = builder.append(upperString);
                }else {
                    builder = builder.append(" ");
                }
            }
            System.out.println("Output-->" + builder);

        }
       /*char result = 'H';
        System.out.println((int) result);*/
      //  System.out.println((char)101-4);*/

        /*Scanner s = new Scanner(System.in);
        String inputString = s.next();
        String [] inputArray = inputString.split(":");
        System.out.println(calculateAngle(Double.parseDouble(inputArray[0]),Double.parseDouble(inputArray[1])));*/
    }

    static int calculateAngle(double h, double m)
    {
        if(h<0 || m<0 || h>22 ||m>60) {
            System.out.println("wrong input");
        }
        if(h==12){
            h=0;
        }
        if(m==60) {
            m=0;
           // h++;
        }

        int hour_angle = (int)(0.5*(h*60+m));
        int mminute_angle = (int)(6*m);
        int angle =Math.abs(hour_angle-mminute_angle);
        angle = Math.min(360-angle, angle);

        return angle;
    }
}
