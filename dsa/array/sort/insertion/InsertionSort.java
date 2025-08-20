package dsa.array.sort.insertion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
        int[] arr2 = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(arr2));
        insertionSort2(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    // done by me
    static void insertionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else if (arr[j] > arr[j-1]) break;
            }
        }
    }

    // done by kunal
    static void insertionSort2(int[] arr) {
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
    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
