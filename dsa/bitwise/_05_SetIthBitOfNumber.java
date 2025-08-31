package dsa.bitwise;

import java.util.Scanner;

public class _05_SetIthBitOfNumber {
    public static void main(String[] args) {
        // Question : Set ith bit of number -> if 0 then 1 else if 1 then 0

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(num + " in binary : " + Integer.toBinaryString(num));
        System.out.print("Enter target bit : ");
        int targetBit = sc.nextInt();

        int ans = num | (1 << targetBit - 1);
        System.out.println("Setting bit : " + Integer.toBinaryString(ans));
        System.out.println("Number became : " + ans);
    }
}
