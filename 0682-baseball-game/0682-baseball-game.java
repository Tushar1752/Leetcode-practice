class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s= new Stack<>();

        for(String op : operations){
            if(op.equals("C")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else if(op.equals("D")){
                if(!s.isEmpty()){
                    s.push(2 * s.peek());
                }
            }
            else if(op.equals("+")){
                int last = s.pop();
               int secondLast = s.peek();

               s.push(last);
                s.push(last + secondLast);
               
            }
            else{
                s.push(Integer.parseInt(op));
            }
            
        }
        int sum =0;
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        return sum;
    }
}