class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int []dp = new int[n+1];
        dp[0]= 0;
        dp[1]=0;
        for(int i =2;i<=n;i++){
            int take1 = dp[i-1]+cost[i-1];
            int take2= dp[i-2] + cost[i-2];
            dp[i]= Math.min(take1,take2);
        }
        return dp[n];
        
    }
}