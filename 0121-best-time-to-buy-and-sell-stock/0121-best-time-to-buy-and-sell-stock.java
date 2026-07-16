class Solution {
    public int maxProfit(int[] prices) {
    int minPrice= Integer.MAX_VALUE;
    int maxProfit=0;
    for(int price :prices){
        minPrice=Math.min(minPrice, price);
        maxProfit=Math.max(maxProfit, price-minPrice);
    }
    return maxProfit;


    }
 
}

// Time complexity of this will be 0(n) becaunse here we have some int variables and loops 