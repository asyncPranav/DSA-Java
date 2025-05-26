// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

package dsa.array.search.linear;

import java.util.Arrays;
import java.util.Scanner;

public class CountEvenDigitNumbers {
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
        int res = countNumbers(arr);
        System.out.println("Even digits numbers : "+res);
    }

    // search numbers with even numbers of digits
    static int countNumbers(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int numberOfDigits = countDigits(arr[i]);
            if(even(numberOfDigits)) {
                count++;
            }
        }
        return count;
    }

    // helper method to find if no of digits are even or not
    static boolean even(int n){
        return n % 2 == 0;
    }

    // helper method to count digits
    static int countDigits(int n){
        if(n < 0){
            n = n * -1;
        }
        int count = 0;
        while(n > 0 || count == 0){
            count++;
            n /= 10;
        }
        return count;
    }

    //another way to find numbers of digits
    static int countDigits2(int n){
        if(n < 0){
            n = n * -1;
        }
        if(n == 0){
            return 1;
        }
        /*
            int count = 0;
            while(n > 0){
                count++;
                n /= 10;
            }
            return count;
        */
        return (int)Math.log10(n) + 1;
    }
}
