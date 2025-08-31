package dsa.bitwise;

import java.util.Scanner;

public class _06_ResetIthBitOfNumber {
    public static void main(String[] args) {
        // Question : Reset ith bit of number

        //      1 0 1 0 1 1 0 { target bit = 5th }
        //    & 1 1 0 1 1 1 1 { ~(1 << 4(n-1)) }
        //    = 1 0 0 0 1 1 0

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(num + " in binary : " + Integer.toBinaryString(num));
        System.out.print("Enter target bit : ");
        int targetBit = sc.nextInt();

        int ans = num & (~(1 << (targetBit - 1)));
        System.out.println("Resetting bit : " + Integer.toBinaryString(ans));
        System.out.println("Number became : " + ans);
    }
}
