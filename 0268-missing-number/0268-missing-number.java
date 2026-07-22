class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        int x=0;
        for(int i =0; i<=nums.length;i++){
            x=x^i;
        }
        int y=0;
        for(int i =0; i<nums.length;i++){
            y=y^nums[i];
        }
        return x^y;
    }
}