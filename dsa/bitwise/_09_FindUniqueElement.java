package dsa.bitwise;

public class _09_FindUniqueElement {
    public static void main(String[] args) {
        // Question : All elements appears trice(odd) except one element find that unique element
        // Logic : (column_bit_sum % 3) = bit of the unique number

        int[] arr = {2, 2, 3, 4, 2, 4, 4};
        System.out.println("Unique Element : "+findUniqueElement(arr));
    }

    public static int findUniqueElement(int[] nums) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    sum++;
                }
            }
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }
}
