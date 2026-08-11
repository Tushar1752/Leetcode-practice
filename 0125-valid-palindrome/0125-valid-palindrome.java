class Solution {
    public boolean isPalindrome(String s) {
        int left =0,right= s.length()-1;
        while(left<=right){
            char leftC = Character.toLowerCase(s.charAt(left));
            char rightC = Character.toLowerCase(s.charAt(right));

            if(!Character.isLetterOrDigit(leftC)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rightC)){
                right--;
            }
            else if(leftC!= rightC){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;



        
    }
}