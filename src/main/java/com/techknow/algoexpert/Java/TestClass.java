package com.techknow.algoexpert.Java;

public class TestClass {

        private static void show(byte i) {
            System.out.println("In showByte - " + i);
        }

        private static void show(int i) {
            System.out.println("In showInt - " + i);
        }

        private static void show(long i) {
            System.out.println("In showLong - " + i);
        }

        private static void show(double i) {
            System.out.println("In showDouble - " + i);
        }

        public static void main(String[] args) {
            long longVar = 5;
            byte byteVar = 1;

            show(byteVar );
            show(longVar );

            show(10);
            show(10.1);
        }
    }


