package dsa.array.sort.selection;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
        int[] arr2 = {4,5,1,2,3};
        System.out.println(Arrays.toString(arr2));
        selectionSort2(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    // done by me
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxValue = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) { // or ( <= arr.length - 1 - i )
                if (arr[j] > maxValue) {
                    maxValue = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    // done by kunal
    static void selectionSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap with correct index
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swapElement(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int maxIndex = start;
        for (int i = start; i < last; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swapElement(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
