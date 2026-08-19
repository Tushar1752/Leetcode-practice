class Solution {
    public String countAndSay(int n) {

        if(n==1){
            return "1";
        }
        String previous =countAndSay(n-1);
        StringBuilder result = new StringBuilder();
        int i =0;
        while(i< previous.length()){
            char current = previous.charAt(i);
            int count =0;
            while(i < previous.length() && previous.charAt(i) == current){
                count++;
                i++;
            }
            result.append(count);
            result.append(current);
        }
        return result.toString();
        
    }
}