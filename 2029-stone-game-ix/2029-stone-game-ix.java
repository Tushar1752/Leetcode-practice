class Solution {
    public boolean stoneGameIX(int[] stones) {

        int one = 0, two =0,zero=0;

        for(int num : stones){
            if(num % 3==0){
                zero++;
            }
            else if( num % 3 ==1){
                one++;
            }
            else{
                two++;
            }
        }
        if(zero%2==0){
            return one>0 && two > 0;
        }
        return Math.abs(one - two)>2;

        
    }
}