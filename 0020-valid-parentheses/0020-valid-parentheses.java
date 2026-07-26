class Solution {
    public boolean isValid(String s) {
        Stack <Character> st =new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{'||c=='['){
                st.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if(st.empty()) return false;
                if((c== ')' && st.peek() =='(')||
                (c=='}' && st.peek()=='{' ) ||
                ( c==']' && st.peek()=='[')){
                    st.pop();
                }
        
            else{
                return false;
            }
            }
            else{
                return false;
            }


        
    }
    return st.empty();

}

}