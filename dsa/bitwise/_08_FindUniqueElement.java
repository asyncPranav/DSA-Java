package dsa.bitwise;

public class _08_FindUniqueElement {
    public static void main(String[] args) {
        // Question : All elements appears trice(odd) except one element find that unique element
        // Logic : (column_bit_sum % 3) = bit of the unique number

        int[] arr = {2, 2, 3, 4, 2, 4, 4};
        int[] bitCount = new int[32];

        // Step 1: Count bits
        for (int num : arr) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }

        // Step 2: Build result
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bitCount[i] % 3 != 0) {
                result |= (1 << i);
            }
        }

        System.out.println("Unique element: " + result);
    }
}
