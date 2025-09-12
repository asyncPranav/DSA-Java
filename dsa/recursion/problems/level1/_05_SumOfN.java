package dsa.recursion.problems.level1;

public class _05_SumOfN {
    public static void main(String[] args) {
        // Question : Sum of n numbers

        System.out.println(sum(5));
    }
    static int sum(int n){
        if (n == 1) return 1;
        return n + sum(n-1);
    }
}
