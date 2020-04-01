package com.techknow.algoexpert.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* IMPORTANT: Multiple classes and nested static classes are supported */
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class FizzBuzz {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
   */
        //Scanner
     /*   Scanner s1 = new Scanner(System.in);
        int tc = s1.nextInt();                 // Reading input from STDIN

        // Writing output to STDOUT
     //   for (int i = 0; i < tc; i++) {

            Scanner s2 = new Scanner(System.in);
            String value = s2.nextLine();                 // Reading input from STDIN
String v[]= value.split(" ");
for (int j = 0; j < v.length; j++) {
    result(Integer.parseInt(v[j]));
}*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
       /* ArrayList<Integer> inputs = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            inputs.add(Integer.valueOf(br.readLine()));
        }
  for(int v1 : inputs) {

            result(v1);
        }*/
        String inputString [] = br.readLine().split(" ");
        for(String v1 : inputString) {

            result(Integer.parseInt(v1));
        }
       // }

        // Write your code here

    }

    public static void result(int number) {

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }
    }
}
