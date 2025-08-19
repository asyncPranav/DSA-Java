// Ceiling of a number
// Ceiling = smallest element in the array greater or equal to the target element
// arr = {2, 3, 5, 9, 14, 16, 18}
// ceiling(arr, target = 14)  -----> 14
// ceiling(arr, target = 15)  -----> 16
// ceiling(arr, target = 16)  -----> 18
// ceiling(arr, target = 4)   -----> 5
// ceiling(arr, target = 20)  -----> not exist
// ceiling(arr, target = -12) -----> 2

// Step 1 : Find all numbers greater or equal to target element
// Step 2 : Smallest number of selected elements will be answer
// Conclusion : Smallest number >= target number

package dsa.array.search.binary.problems;

public class CeilingOfNumber {
    public static void main(String[] args) {
        // QUESTION : Find ceiling of number 21

        //array sorted in ascending order
        int[] arr = {2,6,12,14,15,17,20,24,27,29,30};

        //target element
        int target = -232;

        //binary search
        int ans = ceiling(arr, target);

        //output
        System.out.println("Ceiling of number "+target+" is : "+ans);

    }

    static int ceiling(int[] arr, int target){
        // If target is greater than the largest element
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        // If target is smaller than or equal to the smallest element
        if (target <= arr[0]) {
            return arr[0];  // First element is the ceiling
        }

        // Perform binary search to find the ceiling
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return arr[mid];
        }

        //if target not found, return smallest element greater than target
        return arr[start];


        /*
            // At the end of binary search, 'start' points to the smallest number greater than or equal to the target.
            // If 'start' is within array bounds, that means a ceiling exists at arr[start].
            // If 'start' == arr.length, it means the target is greater than all elements — so no ceiling exists.

            return (start < arr.length) ? arr[start] : -1;
         */

    }
}
