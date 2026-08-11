class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right= height.length-1;
        int max=0;
        while(left< right){
            int weidth= right - left;
            int minheight = Math.min(height[left],height[right]);
            int maxArea = weidth * minheight;
           max=Math.max(maxArea, max);
           if(height[left]< height[right]){
            left++;
           }
           else{
            right--;
           }


        }
        return max;




    }
}