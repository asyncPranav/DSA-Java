// https://leetcode.com/problems/flipping-an-image - Google

package dsa.bitwise;

import java.util.Arrays;

public class _22_FlippingAnImage {
    public static void main(String[] args) {
        // done by kunal

        int[][] matrix = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        System.out.println("\nMatrix Image ->");
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }

        flipAndInvertImage(matrix);

        System.out.println("\nInverted and FLipped Matrix Image ->");
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }

    }
    // done by kunal
    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // reverse this array
            int cols = row.length;
            for (int i = 0; i < (cols + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[cols - i - 1] ^ 1;
                row[cols - i - 1] = temp;
            }
        }
        return image;
    }
}

// ********************************************************************* //

// (cols + 1) / 2 ensures correct handling when cols is odd
// Example:
// If cols = 4 → (4 + 1) / 2 = 2 iterations.
// If cols = 5 → (5 + 1) / 2 = 3 iterations (middle element will just swap with itself and invert).