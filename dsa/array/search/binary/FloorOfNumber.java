// Floor of a number
// Floor = smallest element in the array greater or equal to the target element
// arr = {2, 3, 5, 9, 14, 16, 18}
// floor(arr, target = 14) -----> 9
// floor(arr, target = 15) -----> 14
// floor(arr, target = 16) -----> 16
// floor(arr, target = 0)  -----> not exist
// floor(arr, target = 18) -----> 18

// Step 1 : Find all numbers smaller or equal to target element
// Step 2 : Greatest number of selected elements will be answer
// Conclusion : Greatest number <= target number

package dsa.array.search.binary;

public class FloorOfNumber {
    public static void main(String[] args) {
        // QUESTION : Find floor of number

        //array sorted in ascending order
        int[] arr = {2,6,12,14,15,17,20,24,27,29,30};

        //target element
        int target = 13;

        //binary search
        int ans = floor(arr, target);

        //output
        System.out.println("Floor of number "+target+" is : "+ans);
    }
    static int floor(int[] arr, int target){
        // If target is greater than or equal to the largest element, return the last element
        if(target >= arr[arr.length-1]){
            return arr[arr.length-1];
        }

        // If target is smaller than or equal to the smallest element, no floor exists
        if(target <= arr[0]){
            return -1;
        }

        // Binary search for floor value
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return arr[mid];
            }
        }

        // 'end' points to the largest number smaller than or equal to target
        return arr[end];
    }
}