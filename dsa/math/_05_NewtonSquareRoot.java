package dsa.math;

public class _05_NewtonSquareRoot {
    public static void main(String[] args) {
        // Question : Find sq root of a number -> Newton Raphson Method

        // Newton Raphson Method
        // -> Formula: x = (x + n/x) / 2 repeated until convergence.
        // -> x = current guess
        // -> N = number whose square root we want
        // -> N/x = correction term (if x is too big, N/x is small; if x is too small, N/x is large)
        // -> Divide by 2 = we take the average between x and N/x.
        // -> Repeat until stable.
        // -> Time Complexity: O(log n) (but fewer steps than binary search).
        // -> Space Complexity: O(1)
        // -> Why it’s in DSA?: Sometimes asked in interviews to test mathematical optimization.


        System.out.println(sqrtNewton(8,5));
        System.out.println(sqrtNewton2(8, 1e-6)); // This means error allowed is 0.000001

    }

    // manual stop after fixed steps
    static double sqrtNewton(int n, int steps){
        double x = n; // start guess
        for (int i = 0; i < steps; i++) {
            x = (x + n / x) / 2; // Newton update
        }
        return x;
    }

    // With condition using Math.abs
    static double sqrtNewton2(double n, double eps) {
        double x = n; // start guess
        while (Math.abs(x * x - n) > eps) {  // stop when close enough
            x = (x + n / x) / 2;
        }
        return x;
    }
}
