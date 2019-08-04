package com.techknow.algoexpert.easy;

import java.util.HashMap;
import java.util.Map;

public class Program_5 {

    static class  Simple {


    public   static int getNthFib(int n) {

        if (n == 2)
            return 1;
        else if (n == 0 || n == 1) {
            return 0;
        } else {

            return getNthFib(n - 1) + getNthFib(n - 2);

        }

    }
}


static  class  Medium {

    public static int getNthFib(int n) {

        Map<Integer, Integer> fibMap = new HashMap<>();

        fibMap.put(0, 0);
        fibMap.put(1, 0);
        fibMap.put(2, 1);

        return getNthFib(n, fibMap);

    }

    public static int getNthFib(int n, Map<Integer, Integer> fibMap) {

        if (fibMap.containsKey(n)) {

            return fibMap.get(n);
        } else {

            fibMap.put(n, getNthFib(n - 1, fibMap) + getNthFib(n - 2, fibMap));

            return fibMap.get(n);
        }

    }
}

    static  class  Complex {

        static  Long getNthFib (Long n) {

            Long lastTwo[] = {0l,1l};

            int counter = 3 ;

            while (counter <= n) {

                counter++;

                Long nextFib = lastTwo[0] + lastTwo[1];
                lastTwo[0] = lastTwo[1];
                lastTwo[1]= nextFib;



            }

            return (n>1) ? lastTwo[1] : lastTwo[0];
        }
    }


public  static  void  main(String args[]) {
    /*System.out.println( System.currentTimeMillis());
        System.out.println(Program_5.Simple.getNthFib(50));
   System.out.println( System.currentTimeMillis());
    System.out.println(Program_5.Medium.getNthFib(50));
    System.out.println(System.currentTimeMillis());

*/
    System.out.println( System.currentTimeMillis()); /*--889489150*/
    System.out.println(Program_5.Complex.getNthFib(1000l));
    System.out.println(System.currentTimeMillis());
}

}
