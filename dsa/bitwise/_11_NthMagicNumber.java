package dsa.bitwise;

public class _11_NthMagicNumber {
    public static void main(String[] args) {

        // Question : Find nth magic number if magic numbers are defined as follows
        // 1st magic number : write 1 in binary i.e -> 0 0 1 and then sum of multiplication of each bit with power of 5  -> 0x5^3 + 0x5^2 + 1x5^1 = 5
        // 2nd magic number : write 2 in binary i.e -> 0 1 0 and then sum of multiplication of each bit with power of 5  -> 0x5^3 + 1x5^2 + 0x5^1 = 25
        // 3rd magic number : write 3 in binary i.e -> 0 1 1 and then sum of multiplication of each bit with power of 5  -> 0x5^3 + 1x5^2 + 1x5^1 = 30
        // 4th magic number : write 4 in binary i.e -> 1 0 0 and then sum of multiplication of each bit with power of 5  -> 1x5^3 + 0x5^2 + 0x5^1 = 125


        System.out.println(nthMagicNumber(6));
        System.out.println(nthMagicNumber(3));
        System.out.println(nthMagicNumber(1));
        System.out.println();

        System.out.println(nthMagicNumber2(6));
        System.out.println(nthMagicNumber2(3));
        System.out.println(nthMagicNumber2(1));

    }
    // done by me
    static int nthMagicNumber(int n) {
        int sum = 0;
        int factor = 5;
        for (int i = 0; i < 32; i++) {    //assuming num is stored in 32 bit
            int lastBit = n & 1;
            sum += lastBit * factor;
            n >>= 1;
            factor *= 5;
        }
        return sum;
    }

    //done by kunal (optimised)
    static int nthMagicNumber2(int n) {
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int lastBit = n & 1;
            n = n >> 1;
            ans += lastBit * base;
            base = base * 5;
        }
        return ans;
    }
}
