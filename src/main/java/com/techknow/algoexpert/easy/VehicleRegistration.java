package com.techknow.algoexpert.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vehicle {
    List<String> numberList = new ArrayList();
    String a;
    String b;
    String c;
    String number;

    public void add() {
        numberList.add(number);

    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Vehcile{" + "a='" + a + '\'' + ", b='" + b + '\'' + ", c='" + c + '\'' + ", number='" + number + '\'' + '}';
    }

    public Vehicle(String a, String b, String c, String number) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.number = number;
    }
}

class VehicleRegistration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = "KA-09-HF-4352, OR-02-AG-5824, MP-01-RE-4321, TN-04-KA-4566, KA-09-HF-9844";
                // sc.nextLine();
                //
        //sc.next();
        String[] inputArray = inputString.trim().split(", ");
        List<String> vehicles = new ArrayList<String>();
        for (String input : inputArray) {

            String[] result = input.trim().split("-");
           // Vehicle v = new Vehicle(result[0], result[1], result[2], result[3]);
          //  v.add();
            //Integer number = Integer.parseInt(result[4]);

            System.out.println("The result"+ result[3]);
            if(validate(result[3])){
                System.out.println("The result"+ input);
                vehicles.add(input);
            }

        }
        //KA-09-HF-4352, OR-02-AG-5824, MP-01-RE-4321, TN-04-KA-4566, KA-09-HF-9844
System.out.println(vehicles.size());
        vehicles.forEach(a->System.out.println(a));

       /* System.out.println(validate("4352"));
        System.out.println(validate("5824"));
        System.out.println(validate("4321"));
        System.out.println(validate("4566"));
        System.out.println(validate("9844"));*/

    }

    static boolean validate(String number) {
if(number.length()<=1) {
    return false;
}
       // Arrays.asList(number.toCharArray()).Integer.parseInt(array)
      Integer value = Integer.parseInt(number);

if(value<=0) {
    return false;
}
      int [] array = new int[number.length()];
    /*  int i = number.length();
      String flag;
//int prev_digits
      while(value>0) {
          i--;
          int lastdigit = value%10;
          array[i]= lastdigit;
          value = value/10;
          //i--;




      }*/

      array =  Integer.toString(value).chars().toArray();

boolean ascending = true;
      boolean descending = true;
      for( int i=0; i<array.length-1;i++) {

          if(array[i] > array[i+1] )
          {
              if(descending) {
                  ascending = false;
              }else {

                  return false;
              }
          }
         else  if(array[i] < array[i+1]  ) {
             if(ascending) {
                 descending =false;
             }else {
                 return false;
             }

          }
      }

        return ascending || descending;
    }
}

