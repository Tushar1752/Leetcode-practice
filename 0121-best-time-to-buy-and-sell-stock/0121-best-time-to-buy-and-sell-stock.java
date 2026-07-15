class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int highest= 0;
        for(int i =1; i<n;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int Profit = prices[i] - min;
            if(Profit > highest){
                highest = Profit;
            }
        }
        return highest;


    }
 
}

// Time complexity of this will be 0(n) becaunse here we have some int variables and loops 