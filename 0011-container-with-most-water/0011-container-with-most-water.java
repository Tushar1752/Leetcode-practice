class Solution {
    public int maxArea(int[] height) {

        int i =0, r=height.length-1, max=0;

        while(i<r){
            max= Math.max(max,(r-i)* Math.min(height[i], height[r]));
            if(height[i]< height[r]){
                i++;
            }
            else{
                r--;
            }
        }
        return max;


    }
}