class Solution {
    public String removeDuplicates(String s) {

        Stack <Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuffer result= new StringBuffer();

        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}