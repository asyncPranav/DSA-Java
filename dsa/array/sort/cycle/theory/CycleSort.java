package dsa.array.sort.cycle.theory;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(arr));
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
        int[] arr2 = {3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(arr2));
        cycleSort2(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void swap(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    // done by me
    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length){
            // arr[0] = 1
            // arr[1] = 2
            // arr[2] = 3
            // should be --> arr[i] = i+1 , if not then swap
            if (arr[i] != i+1) {
                //swap(arr, i, arr[i]-1);
                int correctIndex = arr[i] - 1;
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
    }

    // done by kunal
    static void cycleSort2(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
    }
}