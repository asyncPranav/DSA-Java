package dsa.bitwise;

public class _18_FindXorInRange {
    public static void main(String[] args) {

        // Question : Find xor of numbers from a to b , say 3 to 9
        // Logic : xor(0,9) ^ xor(0,2)

        System.out.println(xorInRange(3,6));
        System.out.println(xorInRange2(3,6));

    }
    // method-01 - Time complexity : O(no of iteration) = O(b-a+1) -> Slow
    static int xorInRange(int a, int b){
        int ans = 0;
        for (int i = a; i <= b; i++) {
            ans ^= i;
        }
        return ans;
    }

    // method-02 - Time complexity : O(1) -> Fast
    static int xorInRange2(int a, int b) {
        return xorUpTo(b) ^ xorUpTo(a-1);
    }
    static int xorUpTo(int n) {
        /* switch (n%4) {
            case 0: return n;
            case 1: return 1;
            case 2: return n+1;
            default: return 0;
        } */

        return switch (n % 4) {
            case 0 -> n;
            case 1 -> 1;
            case 2 -> n + 1;
            default -> 0;
        };
    }
}
