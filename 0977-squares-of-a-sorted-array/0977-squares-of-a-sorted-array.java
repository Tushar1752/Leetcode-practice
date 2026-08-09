class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] nums1= new int[n];
        for(int i =0; i<n;i++){
            nums1[i]= nums[i] * nums[i];

        }
        Arrays.sort(nums1);
        return nums1;
        
    }
}