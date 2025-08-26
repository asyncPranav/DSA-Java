package dsa.recursion.theory;

public class _03_NumberRecursion {
    public static void main(String[] args) {
        // write a fn which take a number and print first five numbers : 1,2,3,4,5
        print(1);
    }

    static void print(int n) {
        if (n==5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);

    }
}
