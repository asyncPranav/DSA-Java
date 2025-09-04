// https://leetcode.com/problems/flipping-an-image - Google

package dsa.bitwise;

import java.util.Arrays;

public class _21_FlippingAnImage {
    public static void main(String[] args) {
        // done by gpt

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
    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // reverse this array
            int cols = row.length;
            for (int i = 0; i < cols / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[cols - i - 1] ^ 1;
                row[cols - i - 1] = temp;
            }
            if (cols % 2 == 1) { // If odd length, invert the middle element
                row[cols / 2] ^= 1;
            }
        }
        return image;
    }
}

// ********************************************************************* //

    //-------> Flipping matrix
    // for (int i = 0; i < image.length; i++) {
    //     int cols = image[i].length;
    //     for (int j = 0; j < cols / 2; j++) {
    //         int temp = image[i][j];
    //         image[i][j] = image[i][cols - j - 1];
    //         image[i][cols - j - 1] = temp;
    //     }
    // }

    //-------> Inverting and Flipping matrix
    // for (int i = 0; i < image.length; i++) {
    //     int cols = image[i].length;
    //     for (int j = 0; j < cols / 2; j++) {
    //         int temp = image[i][j] ^ 1;
    //         image[i][j] = image[i][cols - j - 1] ^ 1;
    //         image[i][cols - j - 1] = temp;
    //     }
    // }
    // if (cols % 2 == 1) {
    //     image[i][cols / 2] ^= 1; // invert middle element if odd length
    // }