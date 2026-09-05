class Solution {
    public int mySqrt(int x) {
        int answer=0;
        for(int i=0; (long)i*i<=x;i++){
            answer=i;
        }
        return answer;

        
    }
}