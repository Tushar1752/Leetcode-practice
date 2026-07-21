class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        // for(int num:nums){
//             for(int i =0; i<nums.length;i++){
//                 ans = ans ^ nums[i];

//             }
// return ans;
        
        for(int num :nums){
            ans = ans ^num;

        }
        return ans;
    }
}