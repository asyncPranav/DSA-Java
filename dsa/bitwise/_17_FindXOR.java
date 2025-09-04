package dsa.bitwise;

public class _17_FindXOR {
    public static void main(String[] args) {

        // Question : Find xor of numbers from 0 to a

        //        a   |  xor from 0 to a
        //      ------|--------------------
        //        0   |   0
        //        1   |   0^1 = 1
        //        2   |   0^1^2 = 3
        //        3   |   0^1^2^3 = 0
        //        4   |   0^1^2^3^4 = 4

        System.out.println(calcXOR(4));
        System.out.println(calcXOR(3));
        System.out.println(calcXOR(9));

    }
    static int calcXOR(int n){
        int rem = n % 4;
        if (rem == 0) return n;
        else if (rem == 1) return 1;
        else if (rem == 2) return n+1;
        else return 0;
    }
    // DSA Bitwise XOR notes
}
