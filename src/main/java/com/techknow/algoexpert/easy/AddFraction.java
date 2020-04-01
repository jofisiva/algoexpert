package com.techknow.algoexpert.easy;

import java.util.HashSet;

public class AddFraction {

    public static void main(String[] args) {
       /* int a, b,c,d,x,y,i,gcd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the numerator for 1st number : ");
        a = sc.nextInt();
        System.out.println("\nEnter the denominator for 1st number : ");
        b = sc.nextInt();
        System.out.println("\nEnter the numerator for 2nd number : ");
        c = sc.nextInt();
        System.out.println("\nEnter the denominator for 2nd number : ");
        d = sc.nextInt();
        x=(a*d)+(b*c); //numerator
        y=b*d; //denominator
        // Trick part. Reduce it to the simplest form by using gcd.
        /*for(i=1; i <= x && i <= y; ++i)
        {
            if(x%i==0 && y%i==0)
                gcd = i;
            System.out.println(gcd +" " + i + " "+ x + " " + y);
        }*/
       /* gcd = gcd(x,y);

        System.out.println("\nThe added fraction is "+ x/gcd + "/" + y/gcd);
        System.out.println();*/
       int a[] = new int[]{1,2,3};
        int b[] = new int[]{10,20,30,40};
        int value =42;
      System.out.println(sumOfTwo(a,b,value));

    }
    static int gcd(int a, int b)
    {
        System.out.println(" "+b +","+ a + "%" +b);
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static boolean  sumOfTwo(int[] a, int[] b, int v) {

        HashSet<Integer> difference = new HashSet<Integer>();


       // List<Integer> diffList = Arrays.stream(b).mapToObj(Integer::new).collect(Collectors.toList());

        for(int i=0;i<a.length;i++){
            int diff = Math.abs(v-a[i]);
difference.add(diff);

        }

        for(int i=0;i<b.length;i++){
            if(difference.contains(b[i])) {
                return true;
            }
        }
        return false;

    }
}

