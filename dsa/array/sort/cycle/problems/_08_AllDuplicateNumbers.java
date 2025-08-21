// https://leetcode.com/problems/find-all-duplicates-in-an-array -

package dsa.array.sort.cycle.problems;

import java.util.ArrayList;
import java.util.List;

public class _08_AllDuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findAllDuplicate(nums);
        System.out.println(ans);
    }

    // method-01
    static List<Integer> findAllDuplicate(int[] nums) {
        int i = 0;
        int correctIndex;
        while (i < nums.length) {
            correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> duplicates = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                // problem says - each integer appears at most twice so it is not necessory to add check, must add for at least twice occuring
                duplicates.contains(nums[index]);
                duplicates.add(nums[index]);
            }
        }
        return duplicates;
    }
    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
