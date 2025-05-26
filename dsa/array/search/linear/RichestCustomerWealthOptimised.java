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
}
