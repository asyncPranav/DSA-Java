package dsa.bitwise;

public class _03_FindUniqueElement {
    public static void main(String[] args) {
        // Question : All elements appears twice except one element find that unique element
        // Logic : XOR ^ operator
        // Concept : a ^ a = 0 and a ^ 0 = a

        int[] arr = {1, 2, 3, 2, 1};
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
            System.out.println(xor);
        }

        System.out.println("Answer : " + xor);
        System.out.println("Answer : " + answer(arr));
    }
    // using fn
    static int answer(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }
}
