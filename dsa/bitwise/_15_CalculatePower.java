package dsa.bitwise;

public class _15_CalculatePower {
    public static void main(String[] args) {

        // Question : Calculate a^b

        System.out.println(calculate(3,6));
        System.out.println(calculate(0,3));
        System.out.println(calculate(3,0));
        System.out.println();

        System.out.println(calculate2(3,6));
        System.out.println(calculate2(0,3));
        System.out.println(calculate2(3,0));

    }
    // method-01 - Time complexity : O(base)
    static int calculate(int base, int power) {
        int ans = 1;
        for (int i = 0; i < power; i++) {
            ans *= base;
        }
        return ans;
    }

    // method-02 - Time complexity : O(log(power))
    static int calculate2(int base, int power){
        int ans = 1;
        while(power > 0){
            int lastBit = power & 1;
            if (lastBit == 1) {  // if power is odd
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        return ans;
    }
}
