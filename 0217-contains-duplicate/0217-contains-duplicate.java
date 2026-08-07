
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> set = new HashMap<>();
        for(int num : nums){
            if(set.containsKey(num)){
                return true;
            }
            set.put(num,1);
        }
        return false;


    }
}

