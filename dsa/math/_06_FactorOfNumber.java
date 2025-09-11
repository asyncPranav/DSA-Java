package dsa.math;

import java.util.ArrayList;

public class _06_FactorOfNumber {
    public static void main(String[] args) {
        // Question : Factors of a number

        factors1(20);
        System.out.println();

        factors2(20);
        System.out.println();

        factors3(20);

    }

    // Bruteforce -> O(n), O(1)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Optimised -> O(√n), O(1)
    static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }
        }
    }

    // Optimised -> O(√n + √n) = O(√n), O(√n)
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
