package dsa.math;

public class _04_FindSquareRoot {
    public static void main(String[] args) {
        // Question : Find sq root of a number

        System.out.println(sqRoot(36));
        System.out.println(sqRoot(0));
        System.out.println(sqRoot(8));
        System.out.println();

        System.out.println(sqRoot2(36));
        System.out.println(sqRoot2(0));
        System.out.println(sqRoot2(8));
        System.out.println();

        System.out.println(sqRoot3(36, 0));
        System.out.println(sqRoot3(0, 0));
        System.out.println(sqRoot3(8, 1));
        System.out.println();

        System.out.println(sqRoot4(36, 0));
        System.out.println(sqRoot4(0, 0));
        System.out.println(sqRoot4(8, 1));
        System.out.println();
    }

    // Bruteforce -> O(n)
    static int sqRoot(int n) {
        for (int i = 0; i <= n; i++) {
            if (i * i == n) return i;
        }
        return -1;
    }

    // Binary search to find sq root of perfect square numbers -> O(log n)
    static int sqRoot2(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid > n) end = mid - 1;
            else if (mid * mid < n) start = mid + 1;
            else return mid;
        }
        return -1;
    }

    // Binary search to find sq root of any number -> O(log n) : Fastest
    static double sqRoot3(int n, int precision) {
        int start = 0;
        int end = n;
        int ans = -1;

        // Step 1: Binary search for integer part
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid > n) {
                end = mid - 1;
            } else if (mid * mid < n) {
                ans = mid;
                start = mid + 1;
            } else return mid;
        }

        // Step 2 : Refine ans for decimal places
        double root = ans;
        double increment = 0.1;

        for (int i = 0; i < precision; i++) {
            while ((root + increment) * (root + increment) <= n) {
                root += increment;
            }
            //root -= increment;
            increment /= 10;
        }
        return root;
    }

    // done by kunal -> O(log n + √n × precision) ≈ O(√n × precision)
    static double sqRoot4(int n, int precision) {
        int start = 0;
        int end = n;
        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root <= n) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }

        return root;
    }
}
