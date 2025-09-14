package dsa.recursion.problems.level1;

public class _06_SumOfDigits {
    public static void main(String[] args) {
        // Question : Sum of digits

        System.out.println(sum(12345));
        System.out.println(sum(1002345000));
        System.out.println(sum(012)); // because numbers starting with 0 are treated as octal -> 012 = 10 in decimal
    }
    static int sum(int n){
        if (n==0) return 0;
        return n%10 + sum(n/10);
    }
}
