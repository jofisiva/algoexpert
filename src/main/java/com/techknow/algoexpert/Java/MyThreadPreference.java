package com.techknow.algoexpert.Java;

public class MyThreadPreference  extends Thread{


    public MyThreadPreference(Runnable r) {
        super(r);
    }

    // Overriding run method of Thread class.
    public void run() {
        System.out.println("In My Thread Class");
    }

    private static class MyRunnable implements Runnable
    {
        // Implementing run method of Runnable interface.
        public void run() {
            System.out.println("In My Runnable Class");
        }
    }

    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread mtp = new MyThreadPreference(r);
        mtp.start();
  r.run();
    }
}

