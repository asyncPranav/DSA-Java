// https://leetcode.com/problems/richest-customer-wealth/description/

package dsa.array.search.linear;

public class RichestCustomerWealthOptimised {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };

        int ans = maxWealth(accounts);
        System.out.println(ans);
        System.out.println(maxWealth2(accounts));
    }

    // find max wealth
    static int maxWealth(int[][] acc){
        int max = Integer.MIN_VALUE;
        for(int[] person : acc){
            int wealth = 0;
            for(int money : person){
                wealth += money;
            }
            max = Math.max(max, wealth);
        }
        return max;
    }

    static int maxWealth2(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int money = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                money += accounts[i][j];
            }
            if (money > max) max = money;
        }
        return max;
    }
}
