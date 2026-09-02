class Solution {
    public int numTrees(int n) {
        
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 1;
        dp[1] = 1;

        // Calculate number of BSTs for each number of nodes
        for (int nodes = 2; nodes <= n; nodes++) {
            
            for (int root = 1; root <= nodes; root++) {
                
                int left = root - 1;
                int right = nodes - root;
                
                dp[nodes] += dp[left] * dp[right];
            }
        }

        return dp[n];
    }
}