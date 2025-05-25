package dsa.array.search.linear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchEvenDigitNumbers {
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

        // output
        int[] res = search(arr);
        System.out.println("Even digits numbers : "+Arrays.toString(res));
    }

    // search numbers with even numbers of digits
    static int[] search(int[] arr){
        ArrayList<Integer> evenDigitNum = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int digits = countDigits(arr[i]);
            if(digits%2==0) evenDigitNum.add(arr[i]);
        }

        // Convert List<Integer> to int[]
        int[] result = new int[evenDigitNum.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = evenDigitNum.get(i);
        }

        return result;
    }

    // helper method to count digits
    static int countDigits(int n){
        int count = 0;
        for (int i = n; i > 0; i /= 10){
            count++;
        }
        return count;
    }
}