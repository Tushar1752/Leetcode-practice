class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE ,  profit =0;
        for(int price : prices){
            min= Math.min(price, min);
            profit=Math.max(profit, price-min);

        }
        return profit;


    }
 
}

// Time complexity of this will be 0(n) becaunse here we have some int variables and loops 