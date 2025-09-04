// https://leetcode.com/problems/flipping-an-image - Google

package dsa.bitwise;

import java.util.Arrays;

public class _20_FlippingAnImage {
    public static void main(String[] args) {
        // done by me (improved)

        int[][] matrix = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        System.out.println("\nMatrix Image ->");
        for(int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }

        // invert and flip matrix
        for (int i = 0; i < matrix.length; i++) {
            // flip each row
            for (int j = 0, k = matrix[i].length-1; j < matrix[i].length/2; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
            // invert each row
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
