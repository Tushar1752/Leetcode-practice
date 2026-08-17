class Solution {
    public int pivotIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            // Left sum
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Right sum
            for (int j = nums.length -1 ; j>i; j--) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}