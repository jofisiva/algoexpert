package com.techknow.algoexpert.leetcode.random;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Ropes {
    public static void main(String[] args) {

        int array [] ={8,4,6,12};

       /*List<Integer> ropes = Arrays.stream(array).mapToObj(Integer::new).collect(Collectors.toList());
        int totalCost = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(ropes);
        while(queue.size()>1) {

           int cost = queue.poll()+queue.poll();
           queue.add(cost);
           totalCost += cost;
        }
System.out.println(totalCost);*/

        List<Integer> number = Arrays.stream(array).mapToObj(Integer::new).collect(Collectors.toList());
        int size = 2;
        PriorityQueue<Integer> sequence = new PriorityQueue<Integer>(number);

        while(sequence.size()!=size) {
            sequence.remove();

        }

       System.out.println( sequence.remove());
    }

}
