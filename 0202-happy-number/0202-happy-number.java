class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> Map = new HashSet<>();

        while(n!=1){
            if(Map.contains(n)){
                return false;
            }
            // Map.put(n,1);
            Map.add(n);
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