package dsa.bitwise;

import java.util.Scanner;

public class _07_PositionOfRightMostSetBit {
    public static void main(String[] args) {
        // Question : Find the position of rightmost set bit
        // The rightmost set bit of a number is the lowest-order (least significant) bit that is 1 in its binary representation.

        // 1 0 1 1 0 1 1 0 0 --> 3rd position

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(num + " in binary : " + Integer.toBinaryString(num));

        System.out.println("Position of rightmost set bit : " + rightmostSetBitPos(num));
        System.out.println("Position of rightmost set bit : " + rightmostSetBitPos2(num));
        System.out.println("Position of rightmost set bit : " + rightmostSetBitPos3(num));
    }

    // Method-01
    public static int rightmostSetBitPos(int n) {
        if (n == 0) return -1;
        int pos = 1;
        while ((n & 1) == 0) {
            // System.out.println(n + " in binary : " + Integer.toBinaryString(n));
            n >>= 1;
            pos++;

        }
        return pos;
    }

    // Method-02
    public static int rightmostSetBitPos2(int n) {
        if (n == 0) return -1;
        return Integer.numberOfTrailingZeros(n) + 1;
    }

    // Method-03
    public static int rightmostSetBitPos3(int n) {
        if (n == 0) return 0;
        // return n & -n; // returns value : 2 ki power (position-1)
        int position = (int) (Math.log(n & -n) / Math.log(2)) + 1; // position = log2(n & -n) + 1
        return position;
    }
}
