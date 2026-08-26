class Solution {
    public int longestSubarray(int[] nums) {
        int left =0;
        int zeroCount = 0;
        int answer =0;

        for(int right =0; right<nums.length; right++){
            if(nums[right] == 0){
                zeroCount++;
            }
            while(zeroCount>1){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
      
            }
            int windowLength = right -left+1;

            int currentLength = windowLength -1;
            answer= Math.max(answer, currentLength);

        }
        return answer;
        
    }
}