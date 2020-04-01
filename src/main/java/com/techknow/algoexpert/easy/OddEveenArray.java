package com.techknow.algoexpert.easy;

public class OddEveenArray {
    public static void main(String[] args) {
        segerateOddEven1(new int[] {3,5,6,8,1});

    }
    /* Stub Code to read numbers given in sample i/p into an array*/
  /*  private static int[] readArrayElements() {
        return java.util.stream.Stream.of(new Scanner(System.in).nextLine().split(":")[1]
                .trim().split(" ")).mapToInt(Integer::parseInt).toArray();
    }*/
  static void segerateOddEven1(int[] array) {
      int j=-1,temp;
      for(int i=0;i<array.length;i++) {
          if(array[i]%2==1) {
              j++;
              temp =array[i];
              array[i] =array[j];
              array[j] =temp;
          }
      }
      for(int value:array) {
          System.out.print(value+" ");
      }
  }
    static void segerateOddEven(int[] array) {

        int left=0;
        int right= array.length-1;
        int temp;
        while (left < right) {

            if(array[left]%2==1 && left<right) {
                left++;
            }
            if(array[right]%2==0 && left<right) {
                right--;
            }
            if(left<right) {
                temp = array[left];
                array[left]= array[right];
                array[right]= temp;
                left++;
                right--;
            }
        }

        for(int value:array) {
            System.out.print(value+" ");
        }
        //Arrays.asList(array).forEach(a->System.out.println(a));
    }
}
