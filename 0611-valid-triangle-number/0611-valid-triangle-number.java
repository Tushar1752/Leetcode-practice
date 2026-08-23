class Solution {
    public int triangleNumber(int[] nums) {
Arrays.sort(nums);
            int count =0;
            int n = nums.length;
            for(int right = n-1; right>=2; right--){
                int left =0;
                int mid = right-1;
                while(left < mid){
                    if(nums[left] + nums[mid] > nums[right]){
                        count += mid-left;
                        mid--;
                    }
                    else{
                        left++;
                    }
                }
            }
            return count;
        
    }
}