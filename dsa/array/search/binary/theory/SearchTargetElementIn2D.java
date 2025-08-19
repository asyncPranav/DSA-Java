package dsa.array.search.binary.theory;

import java.util.Arrays;

public class SearchTargetElementIn2D {
    public static void main(String[] args) {
        // If matrix is sorted in row wise & column wise manner both
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50},
        };
        int target = 37;
        int[] ans = search(matrix, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0){
            if (matrix[r][c] == target) {
                return new int[]{r,c};
            }
            else if (matrix[r][c] < target) {
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
