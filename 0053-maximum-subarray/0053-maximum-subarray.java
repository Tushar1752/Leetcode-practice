class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int highest_sum=nums[0];
        int current_sum=nums[0];
        for(int i=1;i<n;i++){
            if(current_sum < 0){
                current_sum =0;
            }
            current_sum = current_sum + nums[i];
                if (current_sum > highest_sum){
                    highest_sum = current_sum;
                }
            }
            return highest_sum;
        }

    }
