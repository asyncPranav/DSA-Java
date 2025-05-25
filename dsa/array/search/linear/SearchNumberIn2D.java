package dsa.array.search.linear;

import java.util.Arrays;
import java.util.Scanner;

public class SearchNumberIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //array declaration
        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        //target element
        int target = 7;

        //output
        int[] res = search(arr, target);
        System.out.println("Indice : "+ Arrays.toString(res));

    }
    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int element = arr[i][j];
                if (element == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
