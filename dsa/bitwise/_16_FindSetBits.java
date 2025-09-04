package dsa.bitwise;

public class _16_FindSetBits {
    public static void main(String[] args) {

        // Question : Find/Count set bits i.e bits that are 1 in any number
        // 9 -> 1001 then answer will be 2

        System.out.println(setBits(9));
        System.out.println(setBits(3));
        System.out.println(setBits(8));
        System.out.println(setBits(0));
        System.out.println();

        System.out.println(setBits2(9));
        System.out.println(setBits2(3));
        System.out.println(setBits2(8));
        System.out.println(setBits2(0));
        System.out.println();

        System.out.println(setBits3(9));
        System.out.println(setBits3(3));
        System.out.println(setBits3(8));
        System.out.println(setBits3(0));
    }

    // method-01 , Time complexity : O(log2 n)
    static int setBits(int n) {
        int ans = 0;
        while (n > 0) {
            if ((n & 1) == 1) ans++;
            n >>= 1;
        }
        return ans;
    }

    // method-02
    static int setBits2(int n) {
        int ans = 0;
        while (n > 0) {
            n = n - (n & -n);
            ans++;
        }
        return ans;
    }

    // method-03 : Brian Kernighan’s Algorithm (Faster) -> Time complexity : 0(k) where k = no of set bits / no of iteration
    static int setBits3(int n) {
        int ans = 0;
        while (n > 0) {
            n = n & (n - 1);  // Removes the last set bit
            ans++;
        }
        return ans;
    }
}
