// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/ - Google question

package dsa.array.sort.cycle.problems;

import java.util.ArrayList;
import java.util.Arrays;


public class _04_DisappearedNumbers {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 1};
        // int[] arr = {4,3,2,3};
        int[] arr = {4,3,2,7,8,2,3,1};
        int[] ans = findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }
    // done by me
    static int[] findDisappearedNumbers(int[] arr){
        int i = 0;
        // sort array
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
        // find missing numbers
        ArrayList<Integer> missing = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                missing.add(j+1);
            }
        }
        // convert arrayList to array
        int[] result = new int[missing.size()];
        for (int k = 0; k < missing.size(); k++) {
            result[k] = missing.get(k);
        }
        // return missing numbers array
        return result;
    }
    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
