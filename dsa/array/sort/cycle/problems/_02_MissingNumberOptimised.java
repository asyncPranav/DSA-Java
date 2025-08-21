// https://leetcode.com/problems/missing-number/description/

package dsa.array.sort.cycle.problems;

public class _02_MissingNumberOptimised {
    public static void main(String[] args) {
        //int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        //int[] arr = {4,0,2,1};
        int[] arr = {3,0,1,2};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    // done by me
    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correctIndex;
            if (arr[i] != i && arr[i] != arr.length) {
                correctIndex = arr[i];
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
