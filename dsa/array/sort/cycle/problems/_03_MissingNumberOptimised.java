// https://leetcode.com/problems/missing-number/description/ - Amazon Question

package dsa.array.sort.cycle.problems;

public class _03_MissingNumberOptimised {
    public static void main(String[] args) {
        // int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] arr = {3,0,1,2};
        // int[] arr = {4,0,2,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    // done by kunal
    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i];
            if ( arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
        // Case 1 : for arrays like arr = {3,0,1,4}; -> missing element < arr.length
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        // Case 2 : for arrays like arr = {3,0,1,2}; -> missing element == arr.length
        return arr.length;
    }
    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
