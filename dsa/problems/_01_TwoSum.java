package dsa.problems;

import java.util.Arrays;

public class _01_TwoSum {
    public static void main(String[] args) {
        // int[] arr = {2, 5, 7, 3, 1};
        // int target = 9;
        // int[] arr = {3,2,4};
        //int target = 6;
        // int[] arr = {3,3};
        // int target = 6;
        int[] arr = {2, 5, 5, 11};
        int target = 10;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }
}
