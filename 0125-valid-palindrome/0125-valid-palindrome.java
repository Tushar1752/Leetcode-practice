class Solution {
    public boolean isPalindrome(String s) {
        int left =0,right= s.length()-1;
        while(left<=right){
            char leftC = Character.toUpperCase(s.charAt(left));
            char rightC= Character.toUpperCase(s.charAt(right));

            if(!Character.isLetterOrDigit(leftC)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rightC)){
                right--;
            }

            else if(leftC != rightC){
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