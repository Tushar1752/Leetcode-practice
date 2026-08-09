class Solution {
    public int maxProfit(int[] prices) {

        int n=prices.length;
        int min=prices[0];
        int max=0;
        for(int i=1;i<n;i++){
            min= Math.min(prices[i],min);
            int max2= prices[i] - min;
            max = Math.max(max2,max);

        }
return max;

  


    }

 
}

// Time complexity of this will be 0(n) becaunse here we have some int variables and loops 