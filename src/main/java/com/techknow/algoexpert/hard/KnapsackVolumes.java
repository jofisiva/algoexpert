package com.techknow.algoexpert.hard;

import java.util.ArrayList;
import java.util.List;

public class KnapsackVolumes {

    public static void main(String[] args) {
        int[][] input = {{1, 2}, {4, 3}, {5, 6}, {6, 7}};
        int capacity =10;
        List<List<Integer>> volumes = KnapsackProblems(input,10);
            volumes.stream().flatMap(List::stream).forEach(System.out::println);

    }

    public static List<List<Integer>> KnapsackProblems(int[][] items, int capacity) {
int [][] KnapsackValues = new int[items.length+1][capacity+1];

for(int i = 1; i < items.length+1;i++) {
    int currentWeight = items[i-1][1];
    int currentValue = items[i-1][0];
    for(int c=0;c<capacity+1;c++) {

        if(currentWeight>c) {
            KnapsackValues[i][c]= KnapsackValues[i-1][c];

        }else {
            KnapsackValues[i][c]  = Math.max(KnapsackValues[i-1][c],  KnapsackValues[i-1][c-currentWeight] + currentValue);
        }
    }
}
     //   printValues(KnapsackValues);
 return getKnapsackItems(KnapsackValues, items, KnapsackValues[items.length][capacity]);

    }

    private static List<List<Integer>> getKnapsackItems(int[][] knapsackValues, int[][] items, int weight) {

        List<List<Integer>> sequence = new ArrayList<List<Integer>>();
        List<Integer> totalWeight = new ArrayList<Integer>();
        totalWeight.add(weight);
        sequence.add(totalWeight);
        sequence.add(new ArrayList<Integer>());
        int i= knapsackValues.length-1;
        int c= knapsackValues[0].length-1;

        while(i>0) {
            if(knapsackValues[i][c]==knapsackValues[i-1][c]) {
                i--;
            }else {
                sequence.get(1).add(0,i-1);
              //  System.out.println(items[i-1][1] + " " +items[i-1][0]);
                c =c- items[i-1][1];
                i--;
            }
            if(c==0) {
                break;
            }

        }
        return sequence;
    }

    private static void printValues(int [][] values) {

        for(int i=0;i<values.length;i++){
            for(int j=1;j<values[i].length;j++){
                System.out.print(values[i][j] +" ");
            }
            System.out.println();
        }
    }
}
