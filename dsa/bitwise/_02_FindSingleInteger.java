package dsa.bitwise;

public class _02_FindSingleInteger {
    public static void main(String[] args) {
        // Question : All integer have there opposite sign integer in array except one find that integer
        int[] arr = {-2,3,4,-4,-3};
        //int[] arr = {-2,3,4,-4,2};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Answer : "+sum);
    }
}
