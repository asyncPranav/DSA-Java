package dsa.recursion.problems.level1;

public class _01_PrintNto1 {
    public static void main(String[] args) {
        // Question : Print all numbers from n to 1 -> 5, 4, 3, 2, 1
        print(5);
    }
    static void print(int n) {
        if (n==0) return;
        // if (n==1) System.out.println(1);
        else {
            System.out.println(n);
            print(n-1);
        }
    }
}