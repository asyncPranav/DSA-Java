package dsa.array.search.binary;

public class SearchTargetElement {
    public static void main(String[] args) {
        //sorted array in ascending order
        int[] arr = {1,2,34,45,63,73,74};
        int target = 343;

        //binary search target element
        int index = binarySearch(arr, target);

        //output
        if(index != -1) System.out.println("Index of Target element : "+index);
        else System.out.println("Element does not exist");
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            // find the middle element
            // int mid = (start + end)/2; ---> might be possible that (start + end) exceeds the range of the int in java
            int mid = start + (end - start)/2;

            if (target > arr[mid]) start = mid + 1;
            else if (target < arr[mid]) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}
