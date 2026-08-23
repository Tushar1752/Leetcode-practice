class Solution{
    public int trap(int[] height){
        int n = height.length;
        int left=0;
        int right =n-1;
        int leftMax=height[0];
        int rightMax=height[n-1];
        int water=0;
        while(left < right){
            leftMax= Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if(leftMax< rightMax){
                water += leftMax - height[left];
                left++;
            }
            else{
                water += rightMax - height[right];
                right--;
            }
        }
        return water;

    }
}