package com.techknow.algoexpert.leetcode.week3;

public class SortedRotateArray {
    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, -1, 0, 1, 2 };

        System.out.println(findIndexTarget(arr, 0));
    }

    static int findIndexTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[start] <= arr[mid]) {

                if (target >= arr[start] && target <= arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }

            }else  {

                if(target >= arr[mid] && target <= arr[end]) {
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }

        }

        return -1;
    }
}
