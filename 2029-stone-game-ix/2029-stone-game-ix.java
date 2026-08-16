class Solution {
    public boolean stoneGameIX(int[] stones) {

        int [] count= new int[3];
        int n= stones.length;

        for(int num : stones){
            count[num%3]++;
        }

        if(count[0] % 2 == 0){
            return count[1]> 0 && count[2] > 0;
        }
        return Math.abs(count[1] - count[2])>2;


        
    }
}