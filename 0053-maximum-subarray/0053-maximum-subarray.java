class Solution {
    public int maxSubArray(int[] nums) {

        int curr = nums[0];
        int max= nums[0];
        int n = nums.length;
        for(int i =1;i<n;i++){
            if(curr<0){
                curr =0;
            }
            
            curr = curr + nums[i];
            if(curr>max){
                max=curr;
            }
        }
        return max;

    }
}