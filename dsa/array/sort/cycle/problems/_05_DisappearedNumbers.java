package dsa.array.sort.cycle.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_DisappearedNumbers {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 1};
        // int[] arr = {4,3,2,3};
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }
    // done by kunal
    static List<Integer> findDisappearedNumbers(int[] nums){
        int i = 0;
        // sort array
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            }
            else {
                i++;
            }
        }
        // find missing numbers
        List<Integer> missing = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                missing.add(index+1);
            }
        }
        // return missing numbers List
        return missing;
    }
    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
