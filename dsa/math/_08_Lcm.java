package dsa.math;

public class _08_Lcm {
    public static void main(String[] args) {
        // Question : LCM of a number

        // Euclid's Rule : gcd(a, b) = gcd(b, a % b)
        // LCM(a, b) × GCD(a, b) = a × b

        System.out.println(lcm(12, 24));
        System.out.println(lcm(3, 5));
    }

    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
