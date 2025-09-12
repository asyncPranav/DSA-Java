package dsa.recursion.problems.level1;

public class _02_Print1toN {
    public static void main(String[] args) {
        // Question : Print all numbers from 1 to n
        print(5);
    }

    static void print(int n) {
        if (n == 0) return;
        else {
            print(n-1);
            System.out.println(n);
        }
    }
}
