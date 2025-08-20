package dsa.array.sort.bubble;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = {2,1,7,3,0,-1};
        // int[] arr = {1,2,3,4,5};
        int[] arr = {3,1,5,4,2};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr) {
        // for best case -> if array is already sorted in ascending order
        boolean swapped;

        // run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at last respective index
            for (int j = 1; j < arr.length - i; j++) { // or ( j <= arr.length - i - 1 )
                //swap if item is smaller than previous one
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) {
                break;
            }
        }
    }
}
