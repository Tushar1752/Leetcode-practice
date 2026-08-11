class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> Map = new HashMap<>();

        while(n!=1){
            if(Map.containsKey(n)){
                return false;
            }
            Map.put(n,1);
            int sum=0;
            while(n>0){
                int digit= n%10;
                sum += digit*digit;
                n=n/10;
            }
            n=sum;
        }
        return true;

     
        
    }
}