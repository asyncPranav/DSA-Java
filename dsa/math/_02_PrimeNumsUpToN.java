package dsa.math;

public class _02_PrimeNumsUpToN {
    public static void main(String[] args) {
        // find prime numbers up to n - done by kunal

        int n = 40;

        // Time complexity : O(n) * O(√n) = O(n√n)
        for (int i = 0; i <= n; i++) {
            boolean ans = isPrime(i);
            if (ans) System.out.print(i + " ");
        }
        System.out.println();

        boolean[] primes = new boolean[n + 1];
        sieve(n, primes);
    }

    // method-01 : Bruteforce -> Time complexity : O(√n)
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) return false;
            c++;
        }
        return true;
    }

    // method-04 : Precompute using Sieve of Eratosthenes -> Time complexity : O(n log log n)
    static void sieve(int n, boolean[] primes) {
        // false in array means number is prime
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * i; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        // print prime numbers
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) System.out.print(i + " ");
        }
    }
}
