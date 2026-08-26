class Solution {
    public int minOperations(int[] nums, int x) {

        int n = nums.length ;
        int totalSum =0;
        for(int num : nums){
            totalSum += num;
        }
                if (totalSum < x) {

            return -1;

        }
       int target = totalSum -x;
       int left =0;
       int currentSum = 0;
       int maxLength = -1;

       for(int right =0; right < n; right++){
        currentSum += nums[right];
        while(currentSum > target){
            currentSum -= nums[left];
            left++;
        }
        if(currentSum == target){
            int windowLength= right-left +1;
            maxLength= Math.max(maxLength, windowLength);
        }


       }if(maxLength ==-1){
        return -1;
       }
       return n-maxLength;
        
    }
}