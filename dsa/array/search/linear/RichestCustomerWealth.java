// https://leetcode.com/problems/richest-customer-wealth/description/

package dsa.array.search.linear;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {3,2,1}
        };

        int ans = maxWealth(accounts);
        System.out.println(ans);
    }

    // find max wealth
    static int maxWealth(int[][] acc){
        int[] wealth = calcWealth(acc);

        int max = Integer.MIN_VALUE;
        for(int element : wealth){
            if(element > max){
                max = element;
            }
        }
        return max;
    }

    // helper method to calc wealth
    static int[] calcWealth(int[][] acc){
        int[] wealth = new int[acc.length];
        for (int i = 0; i < acc.length; i++) {
            int money = 0;
            for (int j = 0; j < acc[i].length; j++) {
                money += acc[i][j];
            }
            wealth[i] = money;
        }
        return wealth;
    }
}