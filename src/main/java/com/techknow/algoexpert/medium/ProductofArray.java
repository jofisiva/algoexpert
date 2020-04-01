
package com.techknow.algoexpert.medium;

public class ProductofArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };

        System.out.println(test(2,3,0));
        nums =ProductofArray.productSelfOptimal(nums);
        for (int number: nums) {
            System.out.print(number +" ");
        }

    }

    public static double test (int a, int b, int count) {

        count++;
        System.out.println(count+ " "+ a +" "+b);

       return b == 0 ? 1 : Math.pow(a, b) + test(a, b - 1, count);

    }
    public static int[] productSelf(int[] nums) {
int  n = nums.length;
        int[] left_product = new int[nums.length];
        int[] right_product = new int[nums.length];
        int[] output_product = new int[nums.length];
        left_product[0] = 1;
        right_product[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left_product[i] = left_product[i - 1] * nums[i - 1];
        }
        for(int i= n-2;i>=0;i-- ) {
            right_product[i] = right_product[i+1] * nums[i+1];
        }
        for(int i=0;i<n;i++) {
            output_product[i] = left_product[i] * right_product[i];
        }
        return output_product;
    }

    public static int[] productSelfOptimal(int[] nums) {
        int  n = nums.length;

        int[] output_product = new int[nums.length];
        output_product[0] = 1;

        for (int i = 1; i < n; i++) {
            output_product[i] = output_product[i - 1] * nums[i - 1];
        }
    int R=1;
        for(int i=n-1;i>=0;i--) {
            output_product[i] = output_product[i] * R;
            R=R*nums[i];
        }
        return output_product;
    }
}
