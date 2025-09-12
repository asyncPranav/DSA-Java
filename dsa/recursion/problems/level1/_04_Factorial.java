package dsa.recursion.problems.level1;

public class _04_Factorial {
    public static void main(String[] args) {
        // Question : Factorial of a number

        System.out.println(fact(5));
    }

    static long fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }
}
