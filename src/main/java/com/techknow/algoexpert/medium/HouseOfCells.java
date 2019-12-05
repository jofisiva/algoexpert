package com.techknow.algoexpert.medium;

public class HouseOfCells {
    public static void main(String[] args) {

       // int arr[] = { 0, 1, 0, 1, 1, 0, 0, 1 };
        int arr[] ={1,0,0,1,0,0,1,0};
      int   N = 1000000000;

        int arr2[] = prisonAfterNDays(arr, N);
        for(int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]);
        }

    }
//00111110
    public static int[] prisonAfterNDays(int[] cells, int N) {

        for (N = ( N - 1 ) % 14 + 1; N > 0; --N) {
       // while(N>0) {

            System.out.print(" Day "+ N +" ");
            int[] cells2 = new int[cells.length];
            for (int i = 1; i < cells.length-1; ++i)
                cells2[i] = cells[i - 1] == cells[i + 1]
                            ? 1
                            : 0;
            cells = cells2;

            for(int i=0;i<cells.length;i++) {

                System.out.print(cells[i]);
            }
            System.out.println("--");
           // N--;
        }
        //System.out.println(LocalTime.now());
        return cells;
    }
}
