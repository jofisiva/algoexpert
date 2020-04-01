package com.techknow.algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumThreeNumbers {

    public static void main(String[] args) {

       // int array[] = { 12, 3, 1, 2, -6, 5, -8, 6 };
int array[] ={-1, 0, 1, 2, -1, -4};
        List<Integer[]> result = threeNumberSum(array, 0);

        result.forEach(res -> {
            System.out.println(res[0] + " , " + res[1] + " , " + res[2]);

        });

        List<List<Integer>> result1  = threeSum(array);
        result1.forEach(res -> {
            System.out.println(" ");
            res.forEach(a->{
                System.out.print(a +" ");
            });
        });
    }

    static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> result = new ArrayList<>();

        Arrays.sort(array);

        for (int i = 0; i < array.length - 2; i++) {
            int currentValue = array[i];
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {

                int sum = currentValue + array[left] + array[right];
                if (targetSum == sum) {
                    result.add(new Integer[] { currentValue, array[left], array[right] });
                    left++;
                    right--;
                } else if (sum < targetSum) {
                    left++;
                } else if (sum > targetSum) {
                    right--;
                }

            }

        }
        return result;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++) {

            int currentValue = nums[i];
            int left = i+1;
            int right = nums.length-1;

            while(left<right) {

                int currentsum = currentValue+nums[left]+nums[right];

                if(currentsum==0) {

                    List<Integer> result = new ArrayList<Integer>();
                    result.add(currentValue);
                    result.add(nums[left]);
                    result.add(nums[right]);

                    left++;
                    right--;
                    output.add(result);
                }
                else if(currentsum>0) {
                    right--;
                }
                else {
                    left++;
                }

            }

        }
        output = (ArrayList) output.stream().distinct().collect(Collectors.toList());
return output;
    }
}
