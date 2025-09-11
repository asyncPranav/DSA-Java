package dsa.math;

public class _07_EuclidsGCD {
    public static void main(String[] args) {
        // Euclid's algorithm : gcd(a,b) = gcd(b % a, a )
        // Euclid's algorithm : gcd(a, b) = gcd(b, a % b)
        // Both are same

        System.out.println(gcd(18, 48));
        System.out.println(gcd2(18, 48));
    }

    // recursion
    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);

        // Both are same
        // if (b == 0) return a;
        // return gcd(b, a % b);
    }

    // iterative
    static int gcd2(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
