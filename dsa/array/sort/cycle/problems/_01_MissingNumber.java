// https://leetcode.com/problems/missing-number/description/

package dsa.array.sort.cycle.problems;

public class _01_MissingNumber {
    public static void main(String[] args) {
        // int[] arr = {3,0,1};
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    // done by me
    static int missingNumber(int[] arr) {
        sort(arr);
        for (int i = 0; i <= arr.length; i++) {
            boolean isFound = search(arr, i);
            if (!isFound) return i;
        }
        return -1;
    }

    // binary search
    static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return true;
            else if (target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    // insertion sort
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // or { i <= arr.length - 2 }
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    // swap
    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
