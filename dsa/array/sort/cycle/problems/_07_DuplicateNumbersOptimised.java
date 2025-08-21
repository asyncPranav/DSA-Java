// https://leetcode.com/problems/find-the-duplicate-number/description/ - Amazon question

package dsa.array.sort.cycle.problems;

public class _07_DuplicateNumbersOptimised {
    public static void main(String[] args) {
        // int[] nums = {1,3,4,2,2};
        // int[] nums = {3,1,3,4,2};
        int[] nums = {3, 3, 3, 3, 3};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    //done by kunal - we sort and find duplicate simultaneously
    static int findDuplicate(int[] nums) {
        int i = 0;
        int correctIndex;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return Integer.MIN_VALUE;
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
