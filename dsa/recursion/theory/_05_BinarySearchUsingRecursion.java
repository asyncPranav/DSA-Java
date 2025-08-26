package dsa.recursion.theory;

public class _05_BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 12, 16, 22, 43, 75, 90};
        int target = 22;
        int ans = binarySearchUsingRecursion(arr, 0, arr.length - 1, target);
        System.out.println(ans);
    }

    static int binarySearchUsingRecursion(int[] arr, int start, int end, int target) {
        // base case: target not found
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) return mid;
        if (target > arr[mid]) return binarySearchUsingRecursion(arr, mid + 1, end, target);
        else return binarySearchUsingRecursion(arr, start, mid - 1, target);
    }
}