class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left =0;
        int right=1;
        while(right<nums.length){
            if(nums[left] != nums[right]){
                return nums[left];
            }
            left=left+2;
            right=right+2;
     

        }
        return nums[left];
    
        
    }
}