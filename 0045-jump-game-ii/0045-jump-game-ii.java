class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int last=nums.length-1;
        while(last>0){
            for(int i =0; i<last;i++ ){
                if(i+nums[i]>=last){
                    last=i;
                    jumps++;
                    break;
                }
            }
        }
        return jumps;
  
    }
}
