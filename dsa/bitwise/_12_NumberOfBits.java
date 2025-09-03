package dsa.bitwise;

public class _12_NumberOfBits {
    public static void main(String[] args) {

        // Question : Find number of bits in any decimal number

        System.out.println(totalBits(25));
        System.out.println(totalBits2(25,2));
        System.out.println(totalBits2(25,10));

    }
    // method-01
    static int totalBits(int n){
        int ans = 0;
        while(n > 0){
            n = n >> 1;
            ans++;
        }
        return ans;
    }

    // method-02
    static int totalBits2(int num, int base){
        // no of digit in number system of base b : log of number having base b + 1 -> log(base b)(a) + 1
        return (int) (Math.log(num) / Math.log(base) ) + 1;
    }
}
