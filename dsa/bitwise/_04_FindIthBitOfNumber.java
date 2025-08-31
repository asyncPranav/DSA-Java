package dsa.bitwise;

import java.util.Scanner;

public class _04_FindIthBitOfNumber {
    public static void main(String[] args) {
        // Question : Find ith bit of a number

        //   1 0 1 1 0 1 1 0 (target = 5th bit)
        // & 0 0 0 1 0 0 0 0 ( 1 << 4(n-1) )
        // = 0 0 0 1 0 0 0 0

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(num + " in binary : " + Integer.toBinaryString(num));
        System.out.print("Enter target bit : ");
        int targetBit = sc.nextInt();

        if ((num & (1 << (targetBit - 1))) == 0 ) {
            System.out.println("target bit is 0");
        } else {
            System.out.println("target bit is 1");
        }
    }
}
