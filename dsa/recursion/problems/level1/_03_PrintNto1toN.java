package dsa.recursion.problems.level1;

public class _03_PrintNto1toN {
    public static void main(String[] args) {
        // Question : Print all numbers from N to 1 then again to N
        print(5);
    }

    static void print(int n) {
        if (n == 0) return;
        else {
            System.out.println(n);
            print(n-1);
            System.out.println(n);
        }
    }
}
