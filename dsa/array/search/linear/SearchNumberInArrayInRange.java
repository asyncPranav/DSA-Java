// search a number in array in particular range

package dsa.array.search.linear;

import java.util.Arrays;
import java.util.Scanner;

public class SearchNumberInArrayInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter size of array (>=5) : ");
        int n = sc.nextInt();

        //declare array
        int[] arr = new int[n];

        //input array elements
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // print array
        System.out.println("\narr : "+ Arrays.toString(arr));

        // input target element
        System.out.print("Which element you wanna find : ");
        int target = sc.nextInt();

        // output
        int res = search(arr, target);
        if(res != -1) System.out.println("Element found at "+res);
        else System.out.println("Element not found");
    }

    // search in the array in range [2,5] : return index if item found
    // otherwise return -1
    static int search(int[] arr, int target){
        if (arr.length == 0) return -1;
        int start = 2;
        int end = 5;
        System.out.println("\nSearching in range [2,5]");
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}
