package dsa.math;

public class _09_Lcm {
    public static void main(String[] args) {
        System.out.println(lcm1(2, 7));
        System.out.println(lcm2(2, 7));
    }

    // Bruteforce
    static int lcm1(int a, int b) {
        int lcm = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
            lcm++;
        }
    }

    // Optimised : Instead of incrementing by 1, increment by max(a, b) (since LCM must be a multiple of it).
    static int lcm2(int a, int b) {
        int lcm = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
            lcm += Math.max(a, b);
        }
    }
}
