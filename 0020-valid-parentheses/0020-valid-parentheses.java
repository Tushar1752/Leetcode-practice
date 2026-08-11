class Solution {
    public boolean isValid(String s) {
        Stack <Character> st =new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('|| c=='{' || c=='['){
                st.push(c);
            }
            else if( c==')' || c=='}' || c==']'){
                if(st.empty()){
                    return false;
                }
                char top = st.peek();
                if(c ==')' && top == '(' || c=='}' && top=='{' || c==']' && top =='['){
                    st.pop();
                }
                else{
                    return false;
                }



            }
        }
        return st.empty();


        }
    
}