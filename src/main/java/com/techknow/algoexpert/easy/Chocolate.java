package com.techknow.algoexpert.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {

        Scanner inputPrice= new Scanner(System.in);
        int price = inputPrice.nextInt();

        Scanner s1= new Scanner(System.in);
        String inputString[]= s1.nextLine().split(",");
        List<ChocolateSum> chocolateSum = new ArrayList<>();
        for(String s:inputString) {
          String [] chocolate=  s.split(":");
            chocolateSum.add(new ChocolateSum(chocolate[0],Integer.parseInt(chocolate[1]),Integer.parseInt(chocolate[2])));
        }
        int total = 0;
        //ChocolateSum ch1 = new ChocolateSum("Kinder", 30, 2);
       // ChocolateSum ch2 = new ChocolateSum("Cadbury", 15, 8);
        //List<ChocolateSum> chocolateSumList = Arrays.asList(ch1, ch2);
        for (ChocolateSum c : chocolateSum) {
            if (c.getQuantity()>=price) {
                total = price * c.getPrice();
            }
        }
        System.out.println(total);

    }

}

class ChocolateSum {

    private String name;
    private int price;
    private int quantity;

    public ChocolateSum(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
