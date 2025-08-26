package dsa.recursion.theory;

public class _04_NthFibonacci {
    public static void main(String[] args) {
        // find nth fibonacci number : 0, 1, 1, 2, 3, 5, 8, 13
        int ans = findNthFibonacci(7);
        System.out.println(ans);
    }
    static int findNthFibonacci(int n) {
        if (n <= 1) return n;
        return findNthFibonacci(n - 1) + findNthFibonacci(n - 2);
    }
}
