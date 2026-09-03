class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left =0;
        int mask=0;
        int maxLength =0;

        for(int right =0; right<nums.length ;right++){
        
            while ((mask & nums[right]) != 0) {
                mask = mask ^ nums[left];
                left++;
            }
            mask = mask | nums[right];
            int currentLength = right -left +1;
            maxLength = Math.max(currentLength , maxLength);
        }
        return maxLength;
    }
}