//find min and max element of jagged array

package dsa.array.search.linear;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMinAndMaxInJagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input no of rows
        System.out.print("Enter no of rows of Jagged array : ");
        int n = sc.nextInt();

        //jagged array declaration
        int[][] arr = new int[n][];

        //dynamically input no of columns
        for (int row = 0; row < arr.length; row++) {
            System.out.print("Enter no of column of Row "+row+" : ");
            int col = sc.nextInt();
            arr[row] = new int[col];
        }

        //dynamically input elements
        System.out.println("\nEnter elements of Jagged array ->");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //print jagged array
        System.out.println("\nJagged array -> ");
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }

        //output
        System.out.println("\nMax element : "+searchMax(arr));
        System.out.println("Min element : "+searchMin(arr));

    }

    //min element of jagged array
    static int searchMin(int[][] arr){
        if(arr.length == 0){
            throw new RuntimeException("No element is array");
        }

        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        return min;
    }

    //max element of jagged array
    static int searchMax(int[][] arr){
        if(arr.length == 0){
            throw new RuntimeException("No element is array");
        }

        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
