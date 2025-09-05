package dsa.math;

import java.util.Arrays;

public class _03_PrimeNumsUpToN {
    public static void main(String[] args) {
        // find prime numbers up to n - improved using gpt

        int n = 40;

        // Method 1: Check each number individually -> O(n√n)
        System.out.println("Primes using individual check:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println("\n");

        // Method 2: Sieve of Eratosthenes -> O(n log log n)
        System.out.println("Primes using Sieve:");
        boolean[] isPrime = sieve(n);
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) System.out.print(i + " ");
        }
    }

    // Method-01: Check primality individually -> O(√n)
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) return false;
            c++;
        }
        return true;
    }

    // Method-02: Sieve of Eratosthenes -> O(n log log n)
    static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
