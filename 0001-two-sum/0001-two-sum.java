class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int key = target - nums[i];

            if (set.containsKey(key)) {
                return new int[]{set.get(key), i};
            }

            set.put(nums[i], i);
        }

        return new int[]{};
    }
}