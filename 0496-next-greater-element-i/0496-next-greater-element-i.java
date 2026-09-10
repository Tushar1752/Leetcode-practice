class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map= new HashMap<>();
        Stack<Integer> st= new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            int current = nums2[i];
            while(!st.empty() && st.peek() <=  current){
                st.pop();
            }
            if(st.empty()){
                map.put(current,-1);

            }
            else{
                map.put(current,st.peek());
            }
            st.push(current);
        }
        int[] answer = new int[nums1.length];

        for(int i =0;i<nums1.length;i++){
            answer[i] = map.get(nums1[i]);
        }
        return answer;
    }
}