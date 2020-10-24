package com.techknow.algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CoimbationofSum {
   static String outPutString =" ";
    public static void main(String[] args) {

        // int [] array =new int[] {2,3,6,7};
        int[] array = new int[] { 6, 5, 6, 3, 3, 4, 3, 2, 2, 9, 9 };
        List<Integer> inputArray = Arrays.stream(array).mapToObj(Integer::valueOf).collect(Collectors.toList());
        int target = 24;
        System.out.println(combinationSum(inputArray, target));

//List<Integer> inputArray = Arrays.stream(array).mapToObj(Integer::valueOf).collect(Collectors.toList());
    //System.out.println(coimbationSum(inputArray, target));

        // result.stream().flatMap(List::stream).forEach(System.out::println);

      //  formatted(result);
    }

    private static  String combinationSum(List<Integer> a, int s) {
        t("(", 0, s, new TreeSet(a));
        return outPutString == "" ? "Empty" : outPutString;
    }

    private static  void t(String p, int l, int n, Set<Integer> d) {
        if (n == 0)
            outPutString += p.trim() + ")";
        for (var x : d)
            if (n > 0 & x >= l)
                t(p + x + " ", x, n - x, d);
    }


    private static String coimbationSum(List<Integer> candidates, int target) {

        List<Set<Integer>> result = new ArrayList<>();

       if ( candidates.isEmpty()) {
            return "Empty";
        }
        Collections.sort(candidates);

        List<Integer> coimbations = new ArrayList<Integer>();

        tofindCoimbations( result, coimbations, candidates, target, 0, "(");

        return outPutString==""?"Empty" : outPutString;

    }

    private static void tofindCoimbations(List<Set<Integer>> result, List<Integer> coimbations, List<Integer> candidates, int target, int startIndex,String p) {
        // printall(result, coimbations, target);
        //System.out.println("remaining  target "+ target);
        if (target <= 0) {
            if (target == 0) {
                outPutString = outPutString +p.trim() +")";

                result.add(new TreeSet<>(coimbations));
                //System.out.println("End target "+ target);

            }
            return;
        }
        for (int i = startIndex; i < candidates.size(); i++) {

            //System.out.println("startIndex i  "+ i + coimbations[i]);
            //if (candidates[i] > target) {
                //System.out.println("Greater target "+ target);
              //  break;
          //  }
            //System.out.println("start adding "+ candidates[i]);
            coimbations.add(candidates.get(i));
            //System.out.println("size of coimbations before rescuring  "+ coimbations.size());
            tofindCoimbations(result, coimbations, candidates, target - candidates.get(i), i, String.valueOf(candidates.get(i)));
            //System.out.println("Before remove coimbation size "+ coimbations.size());
            coimbations.remove(coimbations.size() - 1);
            //System.out.println("After remove  coimbation size " +  coimbations.size());
        }

    }

    private static void printall(List<List<Integer>> result, List<Integer> coimbations, int target) {
        ////System.out.println(target);
        result.stream().flatMap(List::stream).forEach(System.out::print);
        //System.out.println();
        coimbations.stream().forEach(System.out::print);
        //System.out.println();
    }
}
