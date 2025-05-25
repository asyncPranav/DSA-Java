package dsa.array.search.linear;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        //declare array
        int[] arr = new int[n];

        //input array elements
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // print array
        System.out.println("\narr : "+ Arrays.toString(arr));

        //output
        System.out.println("Minimum element : "+searchMin(arr));
        System.out.println("Maximum element : "+searchMax(arr));
    }
    static int searchMin(int[] arr){
        if( arr == null || arr.length==0) return Integer.MIN_VALUE;

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min) min = arr[i];
        }
        return min;
    }
    static int searchMax(int[] arr){
        if( arr == null || arr.length==0) return Integer.MAX_VALUE;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) max = arr[i];
        }
        return max;
    }
}