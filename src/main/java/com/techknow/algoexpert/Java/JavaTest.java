package com.techknow.algoexpert.Java;

import java.util.Scanner;

public class JavaTest {
    int val  = 10;
    public static void main(String[] args) {

        JavaTest j = new JavaTest();
        System.out.println(j.val);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char c[] = new char[n];
        for(int i = 0; i <n; i++) {
            c[i]= sc.next().charAt(0);
        }
        buildString(c);
    }

    static void buildString(char [] value) {

        StringBuilder builder = new StringBuilder();

        for(Character c : value) {
            builder.append(c.toString());
        }

System.out.println(builder.toString());
        System.out.println(new String(value));
    }
}
