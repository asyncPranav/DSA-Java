package dsa.math;

public class _01_PrimeNumbers {
    public static void main(String[] args) {

        System.out.println(isprime(12));
        System.out.println(isprime(13));
        System.out.println(isprime(36));
        System.out.println();

        System.out.println(isprime2(12));
        System.out.println(isprime2(13));
        System.out.println(isprime2(36));
    }

    // method-01 : bruteforce -> Time complexity : O(n)
    static boolean isprime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // method-02 : Square Root Optimization -> Time complexity : O(√n)
    static boolean isprime2(int n) {
        // if (n <= 1) return false;
        // for (int i = 2; i <= Math.sqrt(n); i++) {
        //     if (n % i == 0) {
        //         return false;
        //     }
        // }
        // return true;

        // another way to implement this logic
        if (n <= 1) return false;
        int c = 2;
        while (c * c <= n) { // same as c <= √n : we just square both side
            if (n % c == 0) return false;
            c++;
        }
        return true;
    }
    // Obsidian -> Dsa -> Prime number
}
