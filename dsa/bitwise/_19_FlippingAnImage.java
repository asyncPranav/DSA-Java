// https://leetcode.com/problems/flipping-an-image - Google

package dsa.bitwise;

import java.util.Arrays;

public class _19_FlippingAnImage {
    public static void main(String[] args) {
        // done by me

        int[][] matrix = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        System.out.println("\nMatrix Image ->");
        for(int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }

        // flip matrix image
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, k = matrix[i].length-1; j < matrix[i].length/2; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }

        System.out.println("\nFlipped Matrix Image ->");
        for(int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }

        // invert matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] ^ 1;
            }
        }

        System.out.println("\nInverted Flipped Matrix Image ->");
        for(int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }
    }
}