package dsa.array.search.binary.theory;

public class OrderAgnosticBinarySearch {
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
        while(start <= end) {
            int mid = start + (end - start) / 2;

            //check type of sorting -> ascending or descending
            if (arr[start] < arr[end]) {
                //sorted in ascending order then
                if (target < arr[mid]) end = mid - 1;
                else if (target > arr[mid]) start = mid + 1;
                else return mid;
            }
            else {
                //sorted in descending order then
                if (target < arr[mid]) start = mid + 1;
                else if (target > arr[mid]) end = mid - 1;
                else return mid;
            }
        }
        //if element not found
        return -1;
    }
}