package dsa.bitwise;

import java.util.Scanner;

public class _01_EvenOrOdd {
    public static void main(String[] args) {
        // Logic : If last bit of number 'N' in binary is 1 then its odd else even
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n = sc.nextInt();

        if ((n & 1) == 1) System.out.println("Odd");
        else System.out.println("Even");
    }
}
