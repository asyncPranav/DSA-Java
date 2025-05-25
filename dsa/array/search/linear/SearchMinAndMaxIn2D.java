package dsa.array.search.linear;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMinAndMaxIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        //declare array
        int[][] arr = new int[n][n];

        //input array elements
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = sc.nextInt();
            }
        }

        // print array
        System.out.println("\narr : ");
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }

        //output
        System.out.println("\nMinimum element : "+searchMin(arr));
        System.out.println("Maximum element : "+searchMax(arr));
    }

    //search min element in 2D
    static int searchMin(int[][] arr){
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Matrix is null or empty");
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) min = arr[i][j];
            }
        }
        return min;
    }

    //search max element in 2D
    static int searchMax(int[][] arr){
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Matrix is null or empty");
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) max = arr[i][j];
            }
        }
        return max;
    }
}