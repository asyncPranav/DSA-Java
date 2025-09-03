package dsa.bitwise;


public class _14_CheckNumberIsPowerOf2 {
    public static void main(String[] args) {
        // Question : check if a number is power of 2 or not
        // Logic : number power of 2 look like : 10, 100, 1000, 10000 etc in binary
        // 1. while n > 0
        // 2. check last bit of number : n & 1
        // 3. if last bit is 1 then increment ones counter
        // 4. right shift n by 1
        // 5. if ones > 1 return false else true

        System.out.println(check(8));
        System.out.println(check(10));
        System.out.println(check(16));
        System.out.println(check(0));
        System.out.println();

        System.out.println(check2(8));
        System.out.println(check2(10));
        System.out.println(check2(16));
        System.out.println(check2(0));
    }

    // method-01 -> handle n = 0 correctly
    static boolean check(int n) {
        int ones = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                ones++;
            }
            n = n >> 1;
        }
        if (ones == 1) {
            return true;
        }
        return false;
    }

    // method-02 (optimised) -> does not handle n = 0 , fix it
    static boolean check2(int n) {
        // if ((n & (n - 1)) == 0) return true;
        // return false;
        if (n == 0) return false;
        return (n & (n - 1)) == 0;
    }

    // Logic : 10000 = 1111 + 1 -> i.e In decimal :  n = (n-1) + 1
    // then , 10000 & 1111 -> 10000 & 01111 -> 0 -> i.e true
    // in decimal, n & (n-1) == 0 then -> true
}
