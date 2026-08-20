class Solution {
    public int numIdenticalPairs(int[] nums) {
HashMap<Integer ,Integer> set = new HashMap<>();
        int count =0;

        for(int num : nums){
            if(set.containsKey(num)){
                count += set.get(num);
            }
            set.put(num, set.getOrDefault(num,0) +1);
        }
return count;
    }
}