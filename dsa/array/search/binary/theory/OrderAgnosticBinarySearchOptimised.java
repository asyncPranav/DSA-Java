package dsa.array.search.binary.theory;

public class OrderAgnosticBinarySearchOptimised {
    public static void main(String[] args) {

        //sorted array
        int[] arr = {7, 5, 3, 1, 0, -3, -7, -9};
        int target = -3;

        //binary search the target element
        int index = orderAgnosticBinarySearch(arr, target);

        //output
        if (index != -1) System.out.println("Index of Target element : "+index);
        else System.out.println("Element does not exist");


    }

    //order agnostic binary search
    //return index if element found else return -1
    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find whether array is sorted in ascending or not
        boolean isAscending = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            //this is common for both ascending and descending
            if (target == arr[mid]) return mid;

            //if array is sorted in ascending
            if (isAscending) {
                if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
            else {
                //if array is sorted in descending
                if (target < arr[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        //if element not found
        return -1;
    }
}
