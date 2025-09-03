package dsa.bitwise;

public class _13_RowSumOfPascalTriangle {
    public static void main(String[] args) {
        //    Row 0:        1
        //    Row 1:       1 1
        //    Row 2:      1 2 1
        //    Row 3:     1 3 3 1
        //    Row 4:    1 4 6 4 1
        //    Row 5:   1 5 10 10 5 1

        // Logic : sum of nth row = 2 ki power n
        // How : because each row represent identity (1 + 1)^n , where n = row


        System.out.println(rowSum(3));
        System.out.println(rowSum(4));

        System.out.println(rowSum2(3));
        System.out.println(rowSum2(4));
    }
    //method-01
    static int rowSum(int row) {
        return (int) Math.pow(2, row);
    }

    //method-02
    static int rowSum2(int row) {
        return 1 << row;
    }
}
