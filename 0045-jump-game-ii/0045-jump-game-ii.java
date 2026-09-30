class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        
        // Loop through the array up to the second-to-last element
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we reach the end of our current jump window
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                
                // Optimization: if we can already reach the last index, break early
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }
        
        return jumps;
    }
}
